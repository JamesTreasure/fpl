
package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Elements {

    @JsonProperty("1")
    private Map<Integer, EventWrapper> _1;

    public Map<Integer, EventWrapper> get_1() {
        return _1;
    }

    public void set_1(Map<Integer, EventWrapper> _1) {
        this._1 = _1;
    }
}
