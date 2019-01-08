package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeagueStandingResultDto {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("entry_name")
    private String entryName;
    @JsonProperty("event_total")
    private Integer eventTotal;
    @JsonProperty("player_name")
    private String playerName;
    @JsonProperty("movement")
    private String movement;
    @JsonProperty("own_entry")
    private Boolean ownEntry;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("last_rank")
    private Integer lastRank;
    @JsonProperty("rank_sort")
    private Integer rankSort;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("entry")
    private Integer entry;
    @JsonProperty("league")
    private Integer league;
    @JsonProperty("start_event")
    private Integer startEvent;
    @JsonProperty("stop_event")
    private Integer stopEvent;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("entry_name")
    public String getEntryName() {
        return entryName;
    }

    @JsonProperty("entry_name")
    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    @JsonProperty("event_total")
    public Integer getEventTotal() {
        return eventTotal;
    }

    @JsonProperty("event_total")
    public void setEventTotal(Integer eventTotal) {
        this.eventTotal = eventTotal;
    }

    @JsonProperty("player_name")
    public String getPlayerName() {
        return playerName;
    }

    @JsonProperty("player_name")
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @JsonProperty("movement")
    public String getMovement() {
        return movement;
    }

    @JsonProperty("movement")
    public void setMovement(String movement) {
        this.movement = movement;
    }

    @JsonProperty("own_entry")
    public Boolean getOwnEntry() {
        return ownEntry;
    }

    @JsonProperty("own_entry")
    public void setOwnEntry(Boolean ownEntry) {
        this.ownEntry = ownEntry;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("last_rank")
    public Integer getLastRank() {
        return lastRank;
    }

    @JsonProperty("last_rank")
    public void setLastRank(Integer lastRank) {
        this.lastRank = lastRank;
    }

    @JsonProperty("rank_sort")
    public Integer getRankSort() {
        return rankSort;
    }

    @JsonProperty("rank_sort")
    public void setRankSort(Integer rankSort) {
        this.rankSort = rankSort;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("entry")
    public Integer getEntry() {
        return entry;
    }

    @JsonProperty("entry")
    public void setEntry(Integer entry) {
        this.entry = entry;
    }

    @JsonProperty("league")
    public Integer getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(Integer league) {
        this.league = league;
    }

    @JsonProperty("start_event")
    public Integer getStartEvent() {
        return startEvent;
    }

    @JsonProperty("start_event")
    public void setStartEvent(Integer startEvent) {
        this.startEvent = startEvent;
    }

    @JsonProperty("stop_event")
    public Integer getStopEvent() {
        return stopEvent;
    }

    @JsonProperty("stop_event")
    public void setStopEvent(Integer stopEvent) {
        this.stopEvent = stopEvent;
    }
}