package com.jamestreasure.fantasyfootball.dto.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChipPlaysItem {

  @JsonProperty("chip_name")
  private String chipName;

  @JsonProperty("num_played")
  private int numPlayed;

  public String getChipName() {
    return chipName;
  }

  public int getNumPlayed() {
    return numPlayed;
  }
}
