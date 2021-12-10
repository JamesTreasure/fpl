package com.jamestreasure.fantasyfootball.dto.about;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ElementStats {

	@JsonProperty("name")
	private String name;

	@JsonProperty("label")
	private String label;
}