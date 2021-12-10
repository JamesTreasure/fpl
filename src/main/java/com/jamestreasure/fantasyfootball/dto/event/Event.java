package com.jamestreasure.fantasyfootball.dto.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

  @JsonProperty("data_checked")
  private boolean dataChecked;

  @JsonProperty("deadline_time_game_offset")
  private int deadlineTimeGameOffset;

  @JsonProperty("average_entry_score")
  private int averageEntryScore;

  @JsonProperty("is_previous")
  private boolean isPrevious;

  @JsonProperty("most_selected")
  private int mostSelected;

  @JsonProperty("most_transferred_in")
  private int mostTransferredIn;

  @JsonProperty("finished")
  private boolean finished;

  @JsonProperty("most_captained")
  private int mostCaptained;

  @JsonProperty("chip_plays")
  private List<ChipPlays> chipPlays;

  @JsonProperty("top_element")
  private int topElement;

  @JsonProperty("top_element_info")
  private TopElementInfo topElementInfo;

  @JsonProperty("is_next")
  private boolean isNext;

  @JsonProperty("most_vice_captained")
  private int mostViceCaptained;

  @JsonProperty("deadline_time_epoch")
  private int deadlineTimeEpoch;

  @JsonProperty("name")
  private String name;

  @JsonProperty("deadline_time")
  private String deadlineTime;

  @JsonProperty("transfers_made")
  private int transfersMade;

  @JsonProperty("id")
  private int id;

  @JsonProperty("highest_scoring_entry")
  private int highestScoringEntry;

  @JsonProperty("is_current")
  private boolean isCurrent;

  @JsonProperty("highest_score")
  private int highestScore;
}
