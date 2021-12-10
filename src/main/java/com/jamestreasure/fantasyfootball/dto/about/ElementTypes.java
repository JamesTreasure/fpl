package com.jamestreasure.fantasyfootball.dto.about;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ElementTypes {

	@JsonProperty("singular_name")
	private String singularName;

	@JsonProperty("squad_min_play")
	private int squadMinPlay;

	@JsonProperty("squad_select")
	private int squadSelect;

	@JsonProperty("squad_max_play")
	private int squadMaxPlay;

	@JsonProperty("element_count")
	private int elementCount;

	@JsonProperty("ui_shirt_specific")
	private boolean uiShirtSpecific;

	@JsonProperty("singular_name_short")
	private String singularNameShort;

	@JsonProperty("plural_name")
	private String pluralName;

	@JsonProperty("id")
	private int id;

	@JsonProperty("plural_name_short")
	private String pluralNameShort;

	@JsonProperty("sub_positions_locked")
	private List<Integer> subPositionsLocked;
}