package com.jamestreasure.fantasyfootball.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {

	@JsonProperty("last_deadline_total_transfers")
	private int lastDeadlineTotalTransfers;

	@JsonProperty("favourite_team")
	private int favouriteTeam;

	@JsonProperty("name_change_blocked")
	private boolean nameChangeBlocked;

	@JsonProperty("joined_time")
	private String joinedTime;

	@JsonProperty("leagues")
	private Leagues leagues;

	@JsonProperty("summary_overall_points")
	private int summaryOverallPoints;

	@JsonProperty("current_event")
	private int currentEvent;

	@JsonProperty("player_region_iso_code_short")
	private String playerRegionIsoCodeShort;

	@JsonProperty("player_region_name")
	private String playerRegionName;

	@JsonProperty("last_deadline_value")
	private int lastDeadlineValue;

	@JsonProperty("player_last_name")
	private String playerLastName;

	@JsonProperty("player_region_iso_code_long")
	private String playerRegionIsoCodeLong;

	@JsonProperty("summary_overall_rank")
	private int summaryOverallRank;

	@JsonProperty("last_deadline_bank")
	private int lastDeadlineBank;

	@JsonProperty("summary_event_points")
	private int summaryEventPoints;

	@JsonProperty("kit")
	private Object kit;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("started_event")
	private int startedEvent;

	@JsonProperty("player_first_name")
	private String playerFirstName;

	@JsonProperty("player_region_id")
	private int playerRegionId;

	@JsonProperty("summary_event_rank")
	private int summaryEventRank;
}