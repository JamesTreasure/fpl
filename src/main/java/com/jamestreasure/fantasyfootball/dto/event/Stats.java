package com.jamestreasure.fantasyfootball.dto.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {

  @JsonProperty("goals_scored")
  private int goalsScored;

  @JsonProperty("bps")
  private int bps;

  @JsonProperty("minutes")
  private int minutes;

  @JsonProperty("own_goals")
  private int ownGoals;

  @JsonProperty("bonus")
  private int bonus;

  @JsonProperty("clean_sheets")
  private int cleanSheets;

  @JsonProperty("goals_conceded")
  private int goalsConceded;

  @JsonProperty("total_points")
  private int totalPoints;

  @JsonProperty("penalties_missed")
  private int penaltiesMissed;

  @JsonProperty("yellow_cards")
  private int yellowCards;

  @JsonProperty("red_cards")
  private int redCards;

  @JsonProperty("influence")
  private String influence;

  @JsonProperty("in_dreamteam")
  private boolean inDreamteam;

  @JsonProperty("saves")
  private int saves;

  @JsonProperty("assists")
  private int assists;

  @JsonProperty("threat")
  private String threat;

  @JsonProperty("creativity")
  private String creativity;

  @JsonProperty("ict_index")
  private String ictIndex;

  @JsonProperty("penalties_saved")
  private int penaltiesSaved;
}
