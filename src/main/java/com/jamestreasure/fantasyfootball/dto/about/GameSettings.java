package com.jamestreasure.fantasyfootball.dto.about;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GameSettings{

	@JsonProperty("league_max_size_public_h2h")
	private int leagueMaxSizePublicH2h;

	@JsonProperty("league_ko_first_instead_of_random")
	private boolean leagueKoFirstInsteadOfRandom;

	@JsonProperty("cup_type")
	private Object cupType;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("league_join_public_max")
	private int leagueJoinPublicMax;

	@JsonProperty("cup_start_event_id")
	private Object cupStartEventId;

	@JsonProperty("transfers_sell_on_fee")
	private double transfersSellOnFee;

	@JsonProperty("ui_use_special_shirts")
	private boolean uiUseSpecialShirts;

	@JsonProperty("league_max_ko_rounds_private_h2h")
	private int leagueMaxKoRoundsPrivateH2h;

	@JsonProperty("league_join_private_max")
	private int leagueJoinPrivateMax;

	@JsonProperty("league_points_h2h_draw")
	private int leaguePointsH2hDraw;

	@JsonProperty("stats_form_days")
	private int statsFormDays;

	@JsonProperty("league_h2h_tiebreak_stats")
	private List<String> leagueH2hTiebreakStats;

	@JsonProperty("ui_currency_multiplier")
	private int uiCurrencyMultiplier;

	@JsonProperty("league_points_h2h_win")
	private int leaguePointsH2hWin;

	@JsonProperty("league_max_size_public_classic")
	private int leagueMaxSizePublicClassic;

	@JsonProperty("ui_special_shirt_exclusions")
	private List<Object> uiSpecialShirtExclusions;

	@JsonProperty("sys_vice_captain_enabled")
	private boolean sysViceCaptainEnabled;

	@JsonProperty("league_points_h2h_lose")
	private int leaguePointsH2hLose;

	@JsonProperty("squad_squadsize")
	private int squadSquadsize;

	@JsonProperty("squad_total_spend")
	private int squadTotalSpend;

	@JsonProperty("cup_qualifying_method")
	private Object cupQualifyingMethod;

	@JsonProperty("squad_team_limit")
	private int squadTeamLimit;

	@JsonProperty("league_prefix_public")
	private String leaguePrefixPublic;

	@JsonProperty("cup_stop_event_id")
	private Object cupStopEventId;

	@JsonProperty("transfers_cap")
	private int transfersCap;

	@JsonProperty("league_max_size_private_h2h")
	private int leagueMaxSizePrivateH2h;

	@JsonProperty("squad_squadplay")
	private int squadSquadplay;
}