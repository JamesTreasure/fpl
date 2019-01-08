package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pick {

    @JsonProperty("element")
    private Integer element;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("is_captain")
    private Boolean isCaptain;
    @JsonProperty("is_vice_captain")
    private Boolean isViceCaptain;
    @JsonProperty("multiplier")
    private Integer multiplier;

    @JsonProperty("element")
    public Integer getElement() {
        return element;
    }

    @JsonProperty("element")
    public void setElement(Integer element) {
        this.element = element;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("is_captain")
    public Boolean getIsCaptain() {
        return isCaptain;
    }

    @JsonProperty("is_captain")
    public void setIsCaptain(Boolean isCaptain) {
        this.isCaptain = isCaptain;
    }

    @JsonProperty("is_vice_captain")
    public Boolean getIsViceCaptain() {
        return isViceCaptain;
    }

    @JsonProperty("is_vice_captain")
    public void setIsViceCaptain(Boolean isViceCaptain) {
        this.isViceCaptain = isViceCaptain;
    }

    @JsonProperty("multiplier")
    public Integer getMultiplier() {
        return multiplier;
    }

    @JsonProperty("multiplier")
    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

}