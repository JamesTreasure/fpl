package com.jamestreasure.fantasyfootball.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jamestreasure.fantasyfootball.dto.about.About;
import com.jamestreasure.fantasyfootball.dto.event.EventWrapper;
import com.jamestreasure.fantasyfootball.dto.event.status.EventStatusWrapper;
import com.jamestreasure.fantasyfootball.dto.fixtures.FixturesWrapper;
import com.jamestreasure.fantasyfootball.dto.league.LeagueStandingWrapper;
import com.jamestreasure.fantasyfootball.dto.picks.UserPicksWrapper;
import com.jamestreasure.fantasyfootball.repository.FantasyPremierLeagueApi;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

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
  public FixturesWrapper getFixtures(Integer gameweek) throws UnirestException, IOException {
    HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getFixtures(gameweek);
    JSONObject json = league.getBody().getObject();
    return objectMapper.readValue(json.toString(), FixturesWrapper.class);
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
  public EventStatusWrapper getCurrentGameweek() throws UnirestException, IOException {
    HttpResponse<JsonNode> eventStatus = fantasyPremierLeagueApi.getEventStatus();
    JSONObject json = eventStatus.getBody().getObject();
    return objectMapper.readValue(json.toString(), EventStatusWrapper.class);
  }
}
