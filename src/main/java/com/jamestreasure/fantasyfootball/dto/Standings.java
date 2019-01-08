package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Standings {

    private Boolean hasNext;
    private Integer number;
    @JsonProperty("results")
    private List<LeagueStandingResultDto> results;

}
