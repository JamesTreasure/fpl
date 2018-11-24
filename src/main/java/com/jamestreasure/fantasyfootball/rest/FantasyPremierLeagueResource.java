package com.jamestreasure.fantasyfootball.rest;

import com.jamestreasure.fantasyfootball.dto.GameweekEventWrapper;
import com.jamestreasure.fantasyfootball.dto.FantasyApiRequestWrapper;
import com.jamestreasure.fantasyfootball.dto.UserPicksWrapper;
import com.jamestreasure.fantasyfootball.service.FantasyPremierLeagueService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class FantasyPremierLeagueResource {

    private FantasyPremierLeagueService fantasyPremierLeagueService;

    @Autowired
    public FantasyPremierLeagueResource(FantasyPremierLeagueService fantasyPremierLeagueService) {
        this.fantasyPremierLeagueService = fantasyPremierLeagueService;
    }

    @RequestMapping(value = "/league/{leagueId}", method = RequestMethod.GET)
    public FantasyApiRequestWrapper getLeagueById(@PathVariable String leagueId) throws IOException, UnirestException {
        FantasyApiRequestWrapper league = fantasyPremierLeagueService.getLeague(Integer.parseInt(leagueId));
        return league;
    }

    @RequestMapping(value = "/event/{gameweek}", method = RequestMethod.GET)
    public GameweekEventWrapper getEventByGameweek(@PathVariable String gameweek) throws IOException, UnirestException {
        GameweekEventWrapper gameweekEventWrapper = fantasyPremierLeagueService.getEvent(Integer.parseInt(gameweek));
        return gameweekEventWrapper;
    }

    @RequestMapping(value = "/entry/{userId}/{gameweek}", method = RequestMethod.GET)
    public UserPicksWrapper getPicksByGameweekAndUserId(@PathVariable String gameweek, @PathVariable String userId) throws IOException, UnirestException {
        UserPicksWrapper userPicksWrapper = fantasyPremierLeagueService.getPicksByGameweekAndUserId(Integer.parseInt(gameweek), Integer.parseInt(userId));
        return userPicksWrapper;
    }

}
