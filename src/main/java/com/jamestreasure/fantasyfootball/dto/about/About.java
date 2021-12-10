package com.jamestreasure.fantasyfootball.dto.about;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class About{

	@JsonProperty("element_stats")
	private List<ElementStats> elementStats;

	@JsonProperty("teams")
	private List<TeamsItem> teams;

	@JsonProperty("elements")
	private List<Elements> elements;

	@JsonProperty("game_settings")
	private GameSettings gameSettings;

	@JsonProperty("element_types")
	private List<ElementTypes> elementTypes;

	@JsonProperty("total_players")
	private int totalPlayers;

	@JsonProperty("events")
	private List<EventsItem> events;

	@JsonProperty("phases")
	private List<PhasesItem> phases;
}