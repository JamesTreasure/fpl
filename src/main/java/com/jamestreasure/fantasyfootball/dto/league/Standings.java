package com.jamestreasure.fantasyfootball.dto.league;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Standings {

  @JsonProperty("has_next")
  private Boolean hasNext;

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("results")
  private List<LeagueStandingResult> results;
}
