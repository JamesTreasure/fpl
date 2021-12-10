package com.jamestreasure.fantasyfootball.dto.transfers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transfer{

	@JsonProperty("entry")
	private int entry;

	@JsonProperty("element_out_cost")
	private int elementOutCost;

	@JsonProperty("element_in_cost")
	private int elementInCost;

	@JsonProperty("element_out")
	private int elementOut;

	@JsonProperty("time")
	private String time;

	@JsonProperty("element_in")
	private int elementIn;

	@JsonProperty("event")
	private int event;
}