package com.jamestreasure.fantasyfootball.dto.fixtures;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FixturesWrapperItem{

	@JsonProperty("code")
	private int code;

	@JsonProperty("provisional_start_time")
	private boolean provisionalStartTime;

	@JsonProperty("minutes")
	private int minutes;

	@JsonProperty("kickoff_time")
	private String kickoffTime;

	@JsonProperty("team_h")
	private int teamH;

	@JsonProperty("finished")
	private boolean finished;

	@JsonProperty("started")
	private boolean started;

	@JsonProperty("team_a_difficulty")
	private int teamADifficulty;

	@JsonProperty("finished_provisional")
	private boolean finishedProvisional;

	@JsonProperty("pulse_id")
	private int pulseId;

	@JsonProperty("team_a_score")
	private int teamAScore;

	@JsonProperty("team_a")
	private int teamA;

	@JsonProperty("stats")
	private List<StatsItem> stats;

	@JsonProperty("team_h_difficulty")
	private int teamHDifficulty;

	@JsonProperty("id")
	private int id;

	@JsonProperty("event")
	private int event;

	@JsonProperty("team_h_score")
	private int teamHScore;
}