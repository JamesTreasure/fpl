package com.jamestreasure.fantasyfootball.dto.league;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class League {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("created")
  private String created;

  @JsonProperty("start_event")
  private Integer startEvent;
}
