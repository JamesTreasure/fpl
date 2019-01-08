
package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class A {

    @JsonProperty("value")
    private Integer value;
    @JsonProperty("element")
    private Integer element;

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @JsonProperty("element")
    public Integer getElement() {
        return element;
    }

    @JsonProperty("element")
    public void setElement(Integer element) {
        this.element = element;
    }

}
