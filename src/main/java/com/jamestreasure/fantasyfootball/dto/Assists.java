
package com.jamestreasure.fantasyfootball.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Assists {

    @JsonProperty("a")
    private List<Object> a = null;
    @JsonProperty("h")
    private List<H_> h = null;

    @JsonProperty("a")
    public List<Object> getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(List<Object> a) {
        this.a = a;
    }

    @JsonProperty("h")
    public List<H_> getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(List<H_> h) {
        this.h = h;
    }

}
