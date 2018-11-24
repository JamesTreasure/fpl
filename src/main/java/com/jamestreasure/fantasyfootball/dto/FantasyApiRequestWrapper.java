package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FantasyApiRequestWrapper {

    @JsonProperty("league")
    private LeagueDto league;
    @JsonProperty("standings")
    private Standings standings;

    public LeagueDto getLeagueDto() {
        return league;
    }

    public void setLeagueDto(LeagueDto leagueDto) {
        this.league = leagueDto;
    }

    public Standings getStandings() {
        return standings;
    }

    public void setStandings(Standings standings) {
        this.standings = standings;
    }
}
