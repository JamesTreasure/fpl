package com.jamestreasure.fantasyfootball.metadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cup{

	@JsonProperty("cup_league")
	private int cupLeague;

	@JsonProperty("matches")
	private List<Object> matches;

	@JsonProperty("status")
	private Status status;
}