package com.jamestreasure.fantasyfootball.dto.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ElementsItem {

  @JsonProperty("explain")
  private List<ExplainItem> explain;

  @JsonProperty("stats")
  private Stats stats;

  @JsonProperty("id")
  private int id;
}
