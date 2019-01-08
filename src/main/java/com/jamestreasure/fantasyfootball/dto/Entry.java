
package com.jamestreasure.fantasyfootball.dto;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Entry {

    @JsonProperty("fixtures")
    private List<Fixture> fixtures;
    @JsonProperty("elements")
    private Map<Integer, EventWrapper> elements;

    @JsonProperty("fixtures")
    public List<Fixture> getFixtures() {
        return fixtures;
    }

    @JsonProperty("fixtures")
    public void setFixtures(List<Fixture> fixtures) {
        this.fixtures = fixtures;
    }

    @JsonProperty("elements")
    public Map<Integer, EventWrapper> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(Map<Integer, EventWrapper> elements) {
        this.elements = elements;
    }

}
