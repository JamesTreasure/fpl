package com.jamestreasure.fantasyfootball.repository;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Component;

@Component
public class FantasyPremierLeagueApiImpl implements FantasyPremierLeagueApi {

  @Override
  public HttpResponse<JsonNode> getAbout() throws UnirestException {
    return Unirest.get("https://fantasy.premierleague.com/api/bootstrap-static/")
        .header("accept", "application/json")
        .asJson();
  }

  @Override
  public HttpResponse<JsonNode> getLeague(Integer leagueId, Integer page) throws UnirestException {
    return Unirest.get(
            "https://fantasy.premierleague.com/api/leagues-classic/" + leagueId + "/standings/?page_standings=" + page)
        .header("accept", "application/json")
        .asJson();
  }

  @Override
  public HttpResponse<JsonNode> getFixtures(Integer gameweek) throws UnirestException {
    return Unirest.get("https://fantasy.premierleague.com/api/fixtures/?event=" + gameweek)
        .header("accept", "application/json")
        .asJson();
  }

  @Override
  public HttpResponse<JsonNode> getEvent(Integer gameweek) throws UnirestException {
    return Unirest.get("https://fantasy.premierleague.com/api/event/" + gameweek + "/live/")
        .header("accept", "application/json")
        .asJson();
  }

  @Override
  public HttpResponse<JsonNode> getEntry(Integer userId) throws UnirestException {
    return Unirest.get("https://fantasy.premierleague.com/api/entry/" + userId + '/' )
            .header("accept", "application/json")
            .asJson();
  }

  @Override
  public HttpResponse<JsonNode> getEventStatus() throws UnirestException {
    return Unirest.get("https://fantasy.premierleague.com/api/event-status/")
        .header("accept", "application/json")
        .asJson();
  }

  @Override
  public HttpResponse<JsonNode> getPicksByGameweekAndUserId(Integer gameweek, Integer userId)
      throws UnirestException {
    return Unirest.get(
            "https://fantasy.premierleague.com/api/entry/"
                + userId
                + "/event/"
                + gameweek
                + "/picks/")
        .header("accept", "application/json")
        .asJson();
  }

  @Override
  public HttpResponse<JsonNode> getTransfers(Integer userId) throws UnirestException {
    return Unirest.get(
                    "https://fantasy.premierleague.com/api/entry/"
                            + userId
                            + "/transfers/")
            .header("accept", "application/json")
            .asJson();
  }
}
