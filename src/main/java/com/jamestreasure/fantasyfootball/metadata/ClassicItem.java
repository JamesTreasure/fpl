package com.jamestreasure.fantasyfootball.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClassicItem{

	@JsonProperty("admin_entry")
	private Object adminEntry;

	@JsonProperty("scoring")
	private String scoring;

	@JsonProperty("entry_rank")
	private int entryRank;

	@JsonProperty("created")
	private String created;

	@JsonProperty("max_entries")
	private Object maxEntries;

	@JsonProperty("start_event")
	private int startEvent;

	@JsonProperty("cup_qualified")
	private Object cupQualified;

	@JsonProperty("league_type")
	private String leagueType;

	@JsonProperty("has_cup")
	private boolean hasCup;

	@JsonProperty("name")
	private String name;

	@JsonProperty("closed")
	private boolean closed;

	@JsonProperty("rank")
	private Object rank;

	@JsonProperty("entry_can_admin")
	private boolean entryCanAdmin;

	@JsonProperty("cup_league")
	private Object cupLeague;

	@JsonProperty("entry_last_rank")
	private int entryLastRank;

	@JsonProperty("short_name")
	private String shortName;

	@JsonProperty("id")
	private int id;

	@JsonProperty("entry_can_leave")
	private boolean entryCanLeave;

	@JsonProperty("entry_can_invite")
	private boolean entryCanInvite;
}