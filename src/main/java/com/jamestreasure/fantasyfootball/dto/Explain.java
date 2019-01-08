
package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Explain {

    @JsonProperty("minutes")
    private Minutes minutes;

    @JsonProperty("minutes")
    public Minutes getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(Minutes minutes) {
        this.minutes = minutes;
    }

}
