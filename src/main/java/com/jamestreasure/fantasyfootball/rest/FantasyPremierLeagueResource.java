package com.jamestreasure.fantasyfootball.rest;

import com.jamestreasure.fantasyfootball.dto.about.About;
import com.jamestreasure.fantasyfootball.dto.event.EventWrapper;
import com.jamestreasure.fantasyfootball.dto.event.status.EventStatusWrapper;
import com.jamestreasure.fantasyfootball.dto.fixtures.FixturesWrapperItem;
import com.jamestreasure.fantasyfootball.dto.league.LeagueStandingWrapper;
import com.jamestreasure.fantasyfootball.dto.picks.UserPicksWrapper;
import com.jamestreasure.fantasyfootball.dto.transfers.Transfer;
import com.jamestreasure.fantasyfootball.metadata.Metadata;
import com.jamestreasure.fantasyfootball.service.FantasyPremierLeagueService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class FantasyPremierLeagueResource {

  private final FantasyPremierLeagueService fantasyPremierLeagueService;

  @Autowired
  public FantasyPremierLeagueResource(FantasyPremierLeagueService fantasyPremierLeagueService) {
    this.fantasyPremierLeagueService = fantasyPremierLeagueService;
  }

  @RequestMapping(value = "/about", method = RequestMethod.GET)
  public About getLeagueById() throws IOException, UnirestException {
    About about = fantasyPremierLeagueService.getAbout();
    return about;
  }

  @RequestMapping(value = "/league/{leagueId}/{page}", method = RequestMethod.GET)
  public LeagueStandingWrapper getLeagueById(@PathVariable String leagueId, @PathVariable String page)
      throws IOException, UnirestException {
    LeagueStandingWrapper league =
        fantasyPremierLeagueService.getLeague(Integer.parseInt(leagueId), Integer.parseInt(page));
    return league;
  }

  @RequestMapping(value = "/event/{gameweek}", method = RequestMethod.GET)
  public EventWrapper getEventByGameweek(@PathVariable String gameweek)
      throws IOException, UnirestException {
    return fantasyPremierLeagueService.getEvent(Integer.parseInt(gameweek));
  }

  @RequestMapping(value = "/fixtures/{gameweek}", method = RequestMethod.GET)
  public List<FixturesWrapperItem> getFixturesByGameweek(@PathVariable String gameweek)
      throws IOException, UnirestException {
    return fantasyPremierLeagueService.getFixtures(Integer.parseInt(gameweek));
  }

  @RequestMapping(value = "/entry/{userId}/{gameweek}", method = RequestMethod.GET)
  public UserPicksWrapper getPicksByGameweekAndUserId(
      @PathVariable String gameweek, @PathVariable String userId)
      throws IOException, UnirestException {
    UserPicksWrapper userPicksWrapper =
        fantasyPremierLeagueService.getPicksByGameweekAndUserId(
            Integer.parseInt(gameweek), Integer.parseInt(userId));
    return userPicksWrapper;
  }

  @RequestMapping(value = "/entry/{gameweek}", method = RequestMethod.POST)
  public List<UserPicksWrapper> getPicksByGameweekAndUserIds(
      @PathVariable String gameweek, @RequestBody List<Integer> userIds)
      throws IOException, UnirestException {
    List<UserPicksWrapper> userPicksWrapper =
        fantasyPremierLeagueService.getPicksByGameweekAndUserIds(
            Integer.parseInt(gameweek), userIds);
    return userPicksWrapper;
  }

  @RequestMapping(value = "event-status", method = RequestMethod.GET)
  public EventStatusWrapper getCurrentGameweek() throws IOException, UnirestException {
    EventStatusWrapper currentGameweek = fantasyPremierLeagueService.getCurrentGameweek();
    return currentGameweek;
  }

  @RequestMapping(value = "/transfers", method = RequestMethod.POST)
  public Map<Integer, List<Transfer>> getTransfers(@RequestBody List<Integer> userIds)
      throws IOException, UnirestException {
    return fantasyPremierLeagueService.getTransfers(userIds);
  }

  @RequestMapping(value = "/entry", method = RequestMethod.POST)
  public Map<Integer, Metadata> getEntries(@RequestBody List<Integer> userIds)
          throws IOException, UnirestException {
    return fantasyPremierLeagueService.getEntry(userIds);
  }
}
