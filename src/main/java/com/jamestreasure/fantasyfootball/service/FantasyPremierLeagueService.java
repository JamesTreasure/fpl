package com.jamestreasure.fantasyfootball.service;

import com.jamestreasure.fantasyfootball.dto.about.About;
import com.jamestreasure.fantasyfootball.dto.event.EventWrapper;
import com.jamestreasure.fantasyfootball.dto.event.status.EventStatusWrapper;
import com.jamestreasure.fantasyfootball.dto.fixtures.FixturesWrapper;
import com.jamestreasure.fantasyfootball.dto.league.LeagueStandingWrapper;
import com.jamestreasure.fantasyfootball.dto.picks.UserPicksWrapper;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

public interface FantasyPremierLeagueService {

  About getAbout() throws UnirestException, IOException;

  LeagueStandingWrapper getLeague(Integer leagueId) throws UnirestException, IOException;

  FixturesWrapper getFixtures(Integer gameweek) throws UnirestException, IOException;

  EventWrapper getEvent(Integer gameweek) throws UnirestException, IOException;

  UserPicksWrapper getPicksByGameweekAndUserId(Integer gameweek, Integer userId)
      throws UnirestException, IOException;

  EventStatusWrapper getCurrentGameweek() throws UnirestException, IOException;
}
