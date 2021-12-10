package com.jamestreasure.fantasyfootball.dto.about;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TopElementInfo{

	@JsonProperty("id")
	private int id;

	@JsonProperty("points")
	private int points;
}