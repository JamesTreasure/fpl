package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GameweekEventWrapper {

    @JsonProperty("fixtures")
    private List<Fixture> fixtures;

    @JsonProperty("elements")
    private Map<Integer, EventWrapper> elements;


}
