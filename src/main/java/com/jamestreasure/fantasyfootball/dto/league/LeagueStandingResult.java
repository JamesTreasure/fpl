package com.jamestreasure.fantasyfootball.dto.league;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueStandingResult {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("event_total")
  private Integer eventTotal;

  @JsonProperty("player_name")
  private String playerName;

  @JsonProperty("rank")
  private Integer rank;

  @JsonProperty("last_rank")
  private Integer lastRank;

  @JsonProperty("rank_sort")
  private Integer rankSort;

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("entry")
  private Integer entry;
}
