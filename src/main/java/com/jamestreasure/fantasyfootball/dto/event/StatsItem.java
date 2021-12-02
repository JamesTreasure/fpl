package com.jamestreasure.fantasyfootball.dto.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatsItem {

  @JsonProperty("identifier")
  private String identifier;

  @JsonProperty("value")
  private int value;

  @JsonProperty("points")
  private int points;
}
