package com.jamestreasure.fantasyfootball.rest;

import com.jamestreasure.fantasyfootball.dto.event.EventWrapper;
import com.jamestreasure.fantasyfootball.dto.event.status.EventStatusWrapper;
import com.jamestreasure.fantasyfootball.dto.fixtures.FixturesWrapper;
import com.jamestreasure.fantasyfootball.dto.league.LeagueStandingWrapper;
import com.jamestreasure.fantasyfootball.dto.picks.UserPicksWrapper;
import com.jamestreasure.fantasyfootball.service.FantasyPremierLeagueService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FantasyPremierLeagueResource {

  private final FantasyPremierLeagueService fantasyPremierLeagueService;

  @Autowired
  public FantasyPremierLeagueResource(FantasyPremierLeagueService fantasyPremierLeagueService) {
    this.fantasyPremierLeagueService = fantasyPremierLeagueService;
  }

  @RequestMapping(value = "/league/{leagueId}", method = RequestMethod.GET)
  public LeagueStandingWrapper getLeagueById(@PathVariable String leagueId)
      throws IOException, UnirestException {
    LeagueStandingWrapper league =
        fantasyPremierLeagueService.getLeague(Integer.parseInt(leagueId));
    return league;
  }

  @RequestMapping(value = "/event/{gameweek}", method = RequestMethod.GET)
  public EventWrapper getEventByGameweek(@PathVariable String gameweek)
      throws IOException, UnirestException {
    return fantasyPremierLeagueService.getEvent(Integer.parseInt(gameweek));
  }

  @RequestMapping(value = "/fixtures/{gameweek}", method = RequestMethod.GET)
  public FixturesWrapper getFixturesByGameweek(@PathVariable String gameweek)
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

  @RequestMapping(value = "gameweek", method = RequestMethod.GET)
  public EventStatusWrapper getCurrentGameweek() throws IOException, UnirestException {
    EventStatusWrapper currentGameweek = fantasyPremierLeagueService.getCurrentGameweek();
    return currentGameweek;
  }
}
