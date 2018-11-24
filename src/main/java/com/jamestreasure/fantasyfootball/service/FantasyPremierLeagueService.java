package com.jamestreasure.fantasyfootball.service;

import com.jamestreasure.fantasyfootball.dto.GameweekEventWrapper;
import com.jamestreasure.fantasyfootball.dto.FantasyApiRequestWrapper;
import com.jamestreasure.fantasyfootball.dto.UserPicksWrapper;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

public interface FantasyPremierLeagueService {

    FantasyApiRequestWrapper getLeague(Integer leagueId) throws UnirestException, IOException;

    GameweekEventWrapper getEvent(Integer gameweek) throws UnirestException, IOException;

    UserPicksWrapper getPicksByGameweekAndUserId(Integer gameweek, Integer userId) throws UnirestException, IOException;


}
