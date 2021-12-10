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

  @Autowired
  public FantasyPremierLeagueServiceImpl(
      FantasyPremierLeagueApi fantasyPremierLeagueApi, ObjectMapper mapper) {
    this.fantasyPremierLeagueApi = fantasyPremierLeagueApi;
    this.objectMapper = mapper;
  }

  @Override
  public About getAbout() throws UnirestException, IOException {
    HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getAbout();
    JSONObject json = league.getBody().getObject();
    return objectMapper.readValue(json.toString(), About.class);
  }

  @Override
  public LeagueStandingWrapper getLeague(Integer leagueId) throws UnirestException, IOException {
    HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getLeague(leagueId);
    JSONObject json = league.getBody().getObject();
    return objectMapper.readValue(json.toString(), LeagueStandingWrapper.class);
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
    return userIds.parallelStream()
        .map(
            userId -> {
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

    List<List<Transfer>> collect =
        userIds.parallelStream()
            .map(
                userId -> {
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
  public Map<Integer, Metadata> getEntry(List<Integer> userIds) throws UnirestException, IOException {
      List<Metadata> collect = userIds.parallelStream()
              .map(
                      userId -> {
                          HttpResponse<JsonNode> league = null;
                          try {
                              league = fantasyPremierLeagueApi.getEntry(userId);
                          } catch (UnirestException e) {
                              e.printStackTrace();
                          }
                          JSONObject json = league.getBody().getObject();
                          try {

                              return objectMapper.readValue(json.toString(), Metadata.class);
                          } catch (IOException e) {
                              e.printStackTrace();
                          }
                          return null;
                      })
              .collect(Collectors.toList());
      Map<Integer, Metadata> map = new HashMap<>();
    for (Metadata metadata : collect){
      map.put(metadata.getId(), metadata);
    }
      return map;
  }
}
