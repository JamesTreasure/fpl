package com.jamestreasure.fantasyfootball.dto.about;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamsItem{

	@JsonProperty("strength_defence_away")
	private int strengthDefenceAway;

	@JsonProperty("code")
	private int code;

	@JsonProperty("strength")
	private int strength;

	@JsonProperty("unavailable")
	private boolean unavailable;

	@JsonProperty("strength_overall_away")
	private int strengthOverallAway;

	@JsonProperty("draw")
	private int draw;

	@JsonProperty("team_division")
	private Object teamDivision;

	@JsonProperty("played")
	private int played;

	@JsonProperty("pulse_id")
	private int pulseId;

	@JsonProperty("strength_attack_away")
	private int strengthAttackAway;

	@JsonProperty("points")
	private int points;

	@JsonProperty("loss")
	private int loss;

	@JsonProperty("strength_defence_home")
	private int strengthDefenceHome;

	@JsonProperty("form")
	private Object form;

	@JsonProperty("strength_attack_home")
	private int strengthAttackHome;

	@JsonProperty("strength_overall_home")
	private int strengthOverallHome;

	@JsonProperty("name")
	private String name;

	@JsonProperty("short_name")
	private String shortName;

	@JsonProperty("id")
	private int id;

	@JsonProperty("position")
	private int position;

	@JsonProperty("win")
	private int win;
}