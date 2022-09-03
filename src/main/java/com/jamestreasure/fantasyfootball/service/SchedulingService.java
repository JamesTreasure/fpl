package com.jamestreasure.fantasyfootball.service;

import com.jamestreasure.fantasyfootball.dto.event.EventWrapper;
import com.jamestreasure.fantasyfootball.dto.event.status.EventStatusWrapper;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SchedulingService {

  @Autowired CacheManager cacheManager;
  @Autowired FantasyPremierLeagueService fantasyPremierLeagueService;
  @Autowired SimpMessagingTemplate simpMessagingTemplate;

  private Integer currentGameweek;

  @Scheduled(fixedRate = 30000, initialDelay = 30000)
  public void expireCache() throws UnirestException, IOException {

    EventStatusWrapper eventStatusWrapper = fantasyPremierLeagueService.getCurrentGameweek();
    int liveGameweek = eventStatusWrapper.getStatus().stream().findFirst().get().getEvent();

    if (currentGameweek == null || currentGameweek == 0) {
      currentGameweek = liveGameweek;
    }

    if (liveGameweek > currentGameweek) {
      cacheManager.getCacheNames().stream().forEach(cache -> cacheManager.getCache(cache).clear());
      currentGameweek = liveGameweek;
    }
  }

  @Scheduled(fixedRate = 1000)
  public void publishUpdate() throws UnirestException, IOException {

    EventStatusWrapper eventStatusWrapper = fantasyPremierLeagueService.getCurrentGameweek();
    int currentGameweek = eventStatusWrapper.getStatus().stream().findFirst().get().getEvent();

    if (this.currentGameweek == null || this.currentGameweek == 0) {
      this.currentGameweek = currentGameweek;
    }

    if (currentGameweek > this.currentGameweek) {
      cacheManager.getCacheNames().stream().forEach(cache -> cacheManager.getCache(cache).clear());
      this.currentGameweek = currentGameweek;
    }
  }

  @Scheduled(fixedRate = 10000)
  @MessageMapping("/hello")
  public void sendMessage() throws UnirestException, IOException {
    final String time = new SimpleDateFormat("HH:mm").format(new Date());
    if(currentGameweek != null){
      EventWrapper event = fantasyPremierLeagueService.getEvent(currentGameweek);
      simpMessagingTemplate.convertAndSend(
              "/notification/message", event);
      System.out.println("Sent");
    }

  }
}
