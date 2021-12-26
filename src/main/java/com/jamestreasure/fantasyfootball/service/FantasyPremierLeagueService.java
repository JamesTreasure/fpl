package com.jamestreasure.fantasyfootball.service;

import com.jamestreasure.fantasyfootball.dto.about.About;
import com.jamestreasure.fantasyfootball.dto.event.EventWrapper;
import com.jamestreasure.fantasyfootball.dto.event.status.EventStatusWrapper;
import com.jamestreasure.fantasyfootball.dto.fixtures.FixturesWrapperItem;
import com.jamestreasure.fantasyfootball.dto.league.LeagueStandingWrapper;
import com.jamestreasure.fantasyfootball.dto.picks.UserPicksWrapper;
import com.jamestreasure.fantasyfootball.dto.transfers.Transfer;
import com.jamestreasure.fantasyfootball.metadata.Metadata;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface FantasyPremierLeagueService {

  About getAbout() throws UnirestException, IOException;

  LeagueStandingWrapper getLeague(Integer leagueId, Integer page) throws UnirestException, IOException;

  List<FixturesWrapperItem> getFixtures(Integer gameweek) throws UnirestException, IOException;

  EventWrapper getEvent(Integer gameweek) throws UnirestException, IOException;

  UserPicksWrapper getPicksByGameweekAndUserId(Integer gameweek, Integer userId)
      throws UnirestException, IOException;

  List<UserPicksWrapper> getPicksByGameweekAndUserIds(Integer gameweek, List<Integer> userIds)
          throws UnirestException, IOException;

  EventStatusWrapper getCurrentGameweek() throws UnirestException, IOException;

  Map<Integer, List<Transfer>> getTransfers(List<Integer> userIds) throws UnirestException, IOException;

  Map<Integer, Metadata> getEntry(List<Integer> userIds) throws UnirestException, IOException;
}
 