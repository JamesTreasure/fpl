package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EventWrapper {

    @JsonProperty("stats")
    private Stats stats;

}
