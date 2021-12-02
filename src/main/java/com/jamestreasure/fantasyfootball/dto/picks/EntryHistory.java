package com.jamestreasure.fantasyfootball.dto.picks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryHistory {

  @JsonProperty("rank_sort")
  private int rankSort;

  @JsonProperty("event_transfers")
  private int eventTransfers;

  @JsonProperty("bank")
  private int bank;

  @JsonProperty("total_points")
  private int totalPoints;

  @JsonProperty("rank")
  private int rank;

  @JsonProperty("event")
  private int event;

  @JsonProperty("overall_rank")
  private int overallRank;

  @JsonProperty("event_transfers_cost")
  private int eventTransfersCost;

  @JsonProperty("points_on_bench")
  private int pointsOnBench;

  @JsonProperty("value")
  private int value;

  @JsonProperty("points")
  private int points;
}
