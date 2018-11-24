
package com.jamestreasure.fantasyfootball.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bps {

    @JsonProperty("a")
    private List<A> a = null;
    @JsonProperty("h")
    private List<H_____> h = null;

    @JsonProperty("a")
    public List<A> getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(List<A> a) {
        this.a = a;
    }

    @JsonProperty("h")
    public List<H_____> getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(List<H_____> h) {
        this.h = h;
    }

}
