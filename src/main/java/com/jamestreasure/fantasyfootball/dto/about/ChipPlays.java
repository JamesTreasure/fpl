package com.jamestreasure.fantasyfootball.dto.about;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChipPlays {

	@JsonProperty("chip_name")
	private String chipName;

	@JsonProperty("num_played")
	private int numPlayed;
}