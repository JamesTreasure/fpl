
package com.jamestreasure.fantasyfootball.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RedCards {

    @JsonProperty("a")
    private List<Object> a = null;
    @JsonProperty("h")
    private List<Object> h = null;

    @JsonProperty("a")
    public List<Object> getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(List<Object> a) {
        this.a = a;
    }

    @JsonProperty("h")
    public List<Object> getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(List<Object> h) {
        this.h = h;
    }

}
