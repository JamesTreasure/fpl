package com.jamestreasure.fantasyfootball.dto.fixtures;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatsItem{

	@JsonProperty("identifier")
	private String identifier;

	@JsonProperty("a")
	private List<AItem> A;

	@JsonProperty("h")
	private List<HItem> H;
}