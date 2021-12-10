package com.jamestreasure.fantasyfootball.dto.fixtures;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HItem{

	@JsonProperty("value")
	private int value;

	@JsonProperty("element")
	private int element;
}