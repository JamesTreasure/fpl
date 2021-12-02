package com.jamestreasure.fantasyfootball.dto.event.status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventStatusWrapper {

  @JsonProperty("leagues")
  private String leagues;

  @JsonProperty("status")
  private List<StatusItem> status;

  public String getLeagues() {
    return leagues;
  }

  public List<StatusItem> getStatus() {
    return status;
  }
}
