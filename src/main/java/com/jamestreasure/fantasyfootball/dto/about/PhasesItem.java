package com.jamestreasure.fantasyfootball.dto.about;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhasesItem{

	@JsonProperty("start_event")
	private int startEvent;

	@JsonProperty("stop_event")
	private int stopEvent;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;
}