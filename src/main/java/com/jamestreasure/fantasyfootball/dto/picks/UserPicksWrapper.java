package com.jamestreasure.fantasyfootball.dto.picks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPicksWrapper {

  @JsonProperty("user_id")
  private Integer userId;

  @JsonProperty("entry_history")
  private EntryHistory entryHistory;

  @JsonProperty("automatic_subs")
  private List<Object> automaticSubs;

  @JsonProperty("picks")
  private List<Picks> picks;

  @JsonProperty("active_chip")
  private Object activeChip;
}
