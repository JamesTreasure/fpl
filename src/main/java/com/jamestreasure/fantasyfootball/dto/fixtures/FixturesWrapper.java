package com.jamestreasure.fantasyfootball.dto.fixtures;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FixturesWrapper{

	@JsonProperty("fixtures")
	private List<FixturesWrapperItem> fixturesWrapper;
}