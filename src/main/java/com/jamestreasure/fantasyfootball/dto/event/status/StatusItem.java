package com.jamestreasure.fantasyfootball.dto.event.status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusItem {

  @JsonProperty("date")
  private String date;

  @JsonProperty("bonus_added")
  private boolean bonusAdded;

  @JsonProperty("event")
  private int event;

  @JsonProperty("points")
  private String points;

  public String getDate() {
    return date;
  }

  public boolean isBonusAdded() {
    return bonusAdded;
  }

  public int getEvent() {
    return event;
  }

  public String getPoints() {
    return points;
  }
}
