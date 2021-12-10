package com.jamestreasure.fantasyfootball.repository;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;

public interface FantasyPremierLeagueApi {

  HttpResponse<JsonNode> getAbout() throws UnirestException;

  HttpResponse<JsonNode> getLeague(Integer leagueId) throws UnirestException;

  HttpResponse<JsonNode> getFixtures(Integer gameweek) throws UnirestException;

  HttpResponse<JsonNode> getEvent(Integer gameweek) throws UnirestException;

  HttpResponse<JsonNode> getEntry(Integer userId) throws UnirestException;

  HttpResponse<JsonNode> getEventStatus() throws UnirestException;

  HttpResponse<JsonNode> getPicksByGameweekAndUserId(Integer gameweek, Integer userId)
      throws UnirestException;

  HttpResponse<JsonNode> getTransfers(Integer userId)
          throws UnirestException;
}
