package com.jamestreasure.fantasyfootball.dto.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExplainItem {

  @JsonProperty("fixture")
  private int fixture;

  @JsonProperty("stats")
  private List<StatsItem> stats;
}
