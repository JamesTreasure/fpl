package com.jamestreasure.fantasyfootball.dto.league;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueStandingWrapper {

  @JsonProperty("league")
  private League league;

  @JsonProperty("standings")
  private Standings standings;
}
