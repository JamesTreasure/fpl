package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class UserPicksWrapper {

    private String activeChips;
    private Event event;
    private List<Pick> picks;

    public String getActiveChips() {
        return activeChips;
    }

    public void setActiveChips(String activeChips) {
        this.activeChips = activeChips;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<Pick> getPicks() {
        return picks;
    }

    public void setPicks(List<Pick> picks) {
        this.picks = picks;
    }
}
