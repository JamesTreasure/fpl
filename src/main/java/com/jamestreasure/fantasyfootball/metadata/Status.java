package com.jamestreasure.fantasyfootball.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Status{

	@JsonProperty("qualification_event")
	private Object qualificationEvent;

	@JsonProperty("qualification_state")
	private Object qualificationState;

	@JsonProperty("qualification_numbers")
	private Object qualificationNumbers;

	@JsonProperty("qualification_rank")
	private Object qualificationRank;
}