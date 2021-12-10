package com.jamestreasure.fantasyfootball.metadata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Leagues{

	@JsonProperty("cup_matches")
	private List<Object> cupMatches;

	@JsonProperty("classic")
	private List<ClassicItem> classic;

	@JsonProperty("h2h")
	private List<Object> h2h;

	@JsonProperty("cup")
	private Cup cup;
}