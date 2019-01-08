package com.jamestreasure.fantasyfootball.repository;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Component;

@Component
public class FantasyPremierLeagueApiImpl implements FantasyPremierLeagueApi {

    @Override
    public HttpResponse<JsonNode> getLeague(Integer leagueId) throws UnirestException {
        return Unirest.get("https://fantasy.premierleague.com/drf/leagues-classic-standings/" + leagueId)
                .header("accept", "application/json")
                .asJson();
    }

    @Override
    public HttpResponse<JsonNode> getEvent(Integer gameweek) throws UnirestException {
        return Unirest.get("https://fantasy.premierleague.com/drf/event/" + gameweek + "/live")
                .header("accept", "application/json")
                .asJson();
    }

    @Override
    public HttpResponse<JsonNode> getPicksByGameweekAndUserId(Integer gameweek, Integer userId) throws UnirestException {
        return Unirest.get("https://fantasy.premierleague.com/drf/entry/" + userId + "/event/" + gameweek + "/picks")
                .header("accept", "application/json")
                .asJson();
    }


}
