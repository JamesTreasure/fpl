package com.jamestreasure.fantasyfootball.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jamestreasure.fantasyfootball.dto.CurrentGameweek;
import com.jamestreasure.fantasyfootball.dto.GameweekEventWrapper;
import com.jamestreasure.fantasyfootball.dto.FantasyApiRequestWrapper;
import com.jamestreasure.fantasyfootball.dto.UserPicksWrapper;
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

    private FantasyPremierLeagueApi fantasyPremierLeagueApi;
    private ObjectMapper objectMapper;

    @Autowired
    public FantasyPremierLeagueServiceImpl(FantasyPremierLeagueApi fantasyPremierLeagueApi,
                                           ObjectMapper mapper) {
        this.fantasyPremierLeagueApi = fantasyPremierLeagueApi;
        this.objectMapper = mapper;
    }

    @Override
    public FantasyApiRequestWrapper getLeague(Integer leagueId) throws UnirestException, IOException {
        HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getLeague(leagueId);
        JSONObject json = league.getBody().getObject();
        return objectMapper.readValue(json.toString(), FantasyApiRequestWrapper.class);
    }

    @Override
    public GameweekEventWrapper getEvent(Integer gameweek) throws UnirestException, IOException {
        HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getEvent(gameweek);
        JSONObject json = league.getBody().getObject();
        return objectMapper.readValue(json.toString(), GameweekEventWrapper.class);
    }

    @Override
    public UserPicksWrapper getPicksByGameweekAndUserId(Integer gameweek, Integer userId) throws UnirestException, IOException {
        HttpResponse<JsonNode> league = fantasyPremierLeagueApi.getPicksByGameweekAndUserId(gameweek, userId);
        JSONObject json = league.getBody().getObject();
        return objectMapper.readValue(json.toString(), UserPicksWrapper.class);
    }

    @Override
    public CurrentGameweek getCurrentGameweek() throws UnirestException, IOException {
        for(int i = 1; i < 39; i++){
            System.out.println("Checking gameweek " + i);
            GameweekEventWrapper gameweekEventWrapper = getEvent(i);
            int size = gameweekEventWrapper.getFixtures().size();
            Boolean isFinished = gameweekEventWrapper.getFixtures().get(size-1).getFinished();
            if(!isFinished){
                CurrentGameweek currentGameweek = new CurrentGameweek();
                currentGameweek.setCurrentGameweek(i);
                currentGameweek.setLive(gameweekEventWrapper.getFixtures().get(0).getStarted());
                return currentGameweek;
            }
        }
        return new CurrentGameweek();
    }
}
