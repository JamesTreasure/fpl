package com.jamestreasure.fantasyfootball.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jamestreasure.fantasyfootball.dto.about.About;
import com.jamestreasure.fantasyfootball.dto.event.EventWrapper;
import com.jamestreasure.fantasyfootball.dto.event.status.EventStatusWrapper;
import com.jamestreasure.fantasyfootball.dto.fixtures.FixturesWrapperItem;
import com.jamestreasure.fantasyfootball.dto.league.LeagueStandingWrapper;
import com.jamestreasure.fantasyfootball.dto.picks.UserPicksWrapper;
import com.jamestreasure.fantasyfootball.dto.transfers.Transfer;
import com.jamestreasure.fantasyfootball.metadata.Metadata;
import com.jamestreasure.fantasyfootball.repository.FantasyPremierLeagueApi;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class FantasyPremierLeagueServiceImpl implements FantasyPremierLeagueService {

  private final FantasyPremierLeagueApi fantasyPremierLeagueApi;
  private final ObjectMapper objectMapper;
  @Autowired CacheManager cacheManager;

  @Autowired
  public FantasyPremierLeagueServiceImpl(
      FantasyPremierLeagueApi fantasyPremierLeagueApi, ObjectMapper mapper) {
    this.fantasyPremierLeagueApi = fantasyPremierLeagueApi;
    this.objectMapper = mapper;
  }

  @Override
  public About getAbout() throws UnirestException, IOException {
    Cache aboutCache = cacheManager.getCache("about");
    About cachedAbout = aboutCache.get("about", About.class);
    if (cachedAbout != null) return cachedAbout;

    HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getAbout();
    JSONObject json = league.getBody().getObject();
    About about = objectMapper.readValue(json.toString(), About.class);
    aboutCache.put("about", about);
    return about;
  }

  @Override
  public LeagueStandingWrapper getLeague(Integer leagueId, Integer page)
      throws UnirestException, IOException {
    LeagueStandingWrapper leagueStandingWrapper = new LeagueStandingWrapper();
    boolean hasNext = true;
    for (int i = page; i <= page * 5 && hasNext; i++) {
      HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getLeague(leagueId, i);
      JSONObject json = league.getBody().getObject();
      LeagueStandingWrapper currentLeagueStandingsWrapper =
          objectMapper.readValue(json.toString(), LeagueStandingWrapper.class);
      if (i == page) {
        leagueStandingWrapper.setLeague(currentLeagueStandingsWrapper.getLeague());
        leagueStandingWrapper.setStandings(currentLeagueStandingsWrapper.getStandings());
      } else {
        currentLeagueStandingsWrapper.getStandings().getResults().stream()
            .forEach(r -> leagueStandingWrapper.getStandings().getResults().add(r));
      }
      hasNext = currentLeagueStandingsWrapper.getStandings().getHasNext();
    }
    return leagueStandingWrapper;
  }

  @Override
  public List<FixturesWrapperItem> getFixtures(Integer gameweek)
      throws UnirestException, IOException {
    HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getFixtures(gameweek);
    JSONArray json = league.getBody().getArray();
    FixturesWrapperItem[] fixtures =
        objectMapper.readValue(json.toString(), FixturesWrapperItem[].class);
    return Arrays.asList(fixtures);
  }

  @Override
  public EventWrapper getEvent(Integer gameweek) throws UnirestException, IOException {
    HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getEvent(gameweek);
    JSONObject json = league.getBody().getObject();
    return objectMapper.readValue(json.toString(), EventWrapper.class);
  }

  @Override
  public UserPicksWrapper getPicksByGameweekAndUserId(Integer gameweek, Integer userId)
      throws UnirestException, IOException {
    HttpResponse<JsonNode> league =
        fantasyPremierLeagueApi.getPicksByGameweekAndUserId(gameweek, userId);
    JSONObject json = league.getBody().getObject();
    return objectMapper.readValue(json.toString(), UserPicksWrapper.class);
  }

  @Override
  public List<UserPicksWrapper> getPicksByGameweekAndUserIds(
      Integer gameweek, List<Integer> userIds) {
    Cache userPicksCache = cacheManager.getCache("userPicks");
    return userIds.parallelStream()
        .map(
            userId -> {
              UserPicksWrapper cachedUserPicks = userPicksCache.get(userId, UserPicksWrapper.class);
              if (cachedUserPicks != null) return cachedUserPicks;

              HttpResponse<JsonNode> league = null;
              try {
                league = fantasyPremierLeagueApi.getPicksByGameweekAndUserId(gameweek, userId);
              } catch (UnirestException e) {
                e.printStackTrace();
              }
              JSONObject json = league.getBody().getObject();
              try {
                UserPicksWrapper userPicksWrapper =
                    objectMapper.readValue(json.toString(), UserPicksWrapper.class);
                userPicksWrapper.setUserId(userId);
                userPicksCache.put(userId, userPicksWrapper);
                return userPicksWrapper;
              } catch (IOException e) {
                e.printStackTrace();
              }
              return null;
            })
        .collect(Collectors.toList());
  }

  @Override
  public EventStatusWrapper getCurrentGameweek() throws UnirestException, IOException {
    HttpResponse<JsonNode> eventStatus = fantasyPremierLeagueApi.getEventStatus();
    JSONObject json = eventStatus.getBody().getObject();
    return objectMapper.readValue(json.toString(), EventStatusWrapper.class);
  }

  @Override
  public Map<Integer, List<Transfer>> getTransfers(List<Integer> userIds)
      throws UnirestException, IOException {
    Cache transferCache = cacheManager.getCache("transfers");
    List<List<Transfer>> collect =
        userIds.parallelStream()
            .map(
                userId -> {
                  List<Transfer> cachedUserPicks = transferCache.get(userId, List.class);
                  if (cachedUserPicks != null) return cachedUserPicks;

                  HttpResponse<JsonNode> league = null;
                  try {
                    league = fantasyPremierLeagueApi.getTransfers(userId);
                  } catch (UnirestException e) {
                    e.printStackTrace();
                  }
                  JSONArray json = league.getBody().getArray();
                  try {
                    List<Transfer> transfers =
                        Arrays.asList(objectMapper.readValue(json.toString(), Transfer[].class));
                    transferCache.put(userId, transfers);
                    return transfers;
                  } catch (IOException e) {
                    e.printStackTrace();
                  }
                  return null;
                })
            .collect(Collectors.toList());
    Map<Integer, List<Transfer>> map = new HashMap<>();
    for (List<Transfer> transfers : collect) {
      map.put(transfers.get(0).getEntry(), transfers);
    }
    return map;
  }

  @Override
  public Map<Integer, Metadata> getEntry(List<Integer> userIds)
      throws UnirestException, IOException {
    Cache metadataCache = cacheManager.getCache("metadata");
    List<Metadata> collect =
        userIds.parallelStream()
            .map(
                userId -> {
                  Metadata cachedMetadata = metadataCache.get(userId, Metadata.class);

                  if (cachedMetadata != null) return cachedMetadata;

                  HttpResponse<JsonNode> league = null;
                  try {
                    league = fantasyPremierLeagueApi.getEntry(userId);
                  } catch (UnirestException e) {
                    e.printStackTrace();
                  }
                  JSONObject json = league.getBody().getObject();
                  try {

                    Metadata metadata = objectMapper.readValue(json.toString(), Metadata.class);
                    metadataCache.put(userId, metadata);
                    return metadata;
                  } catch (IOException e) {
                    e.printStackTrace();
                  }
                  return null;
                })
            .collect(Collectors.toList());
    Map<Integer, Metadata> map = new HashMap<>();
    for (Metadata metadata : collect) {
      map.put(metadata.getId(), metadata);
    }
    return map;
  }
}
