package com.jamestreasure.fantasyfootball.dto.picks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Picks {

  @JsonProperty("is_captain")
  private boolean isCaptain;

  @JsonProperty("multiplier")
  private int multiplier;

  @JsonProperty("position")
  private int position;

  @JsonProperty("is_vice_captain")
  private boolean isViceCaptain;

  @JsonProperty("element")
  private int element;
}
