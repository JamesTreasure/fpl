package com.jamestreasure.fantasyfootball.dto.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopElementInfo {

  @JsonProperty("id")
  private int id;

  @JsonProperty("points")
  private int points;

  public int getId() {
    return id;
  }

  public int getPoints() {
    return points;
  }
}
