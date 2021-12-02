package com.jamestreasure.fantasyfootball.dto.about;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jamestreasure.fantasyfootball.dto.event.Event;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class About {

  @JsonProperty("events")
  private List<Event> events;
}
