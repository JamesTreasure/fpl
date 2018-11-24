
package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stats {

    @JsonProperty("yellow_cards")
    private Integer yellowCards;
    @JsonProperty("own_goals")
    private Integer ownGoals;
    @JsonProperty("creativity")
    private Integer creativity;
    @JsonProperty("goals_conceded")
    private Integer goalsConceded;
    @JsonProperty("bonus")
    private Integer bonus;
    @JsonProperty("red_cards")
    private Integer redCards;
    @JsonProperty("saves")
    private Integer saves;
    @JsonProperty("influence")
    private Integer influence;
    @JsonProperty("bps")
    private Integer bps;
    @JsonProperty("clean_sheets")
    private Integer cleanSheets;
    @JsonProperty("assists")
    private Integer assists;
    @JsonProperty("ict_index")
    private Integer ictIndex;
    @JsonProperty("goals_scored")
    private Integer goalsScored;
    @JsonProperty("threat")
    private Integer threat;
    @JsonProperty("penalties_missed")
    private Integer penaltiesMissed;
    @JsonProperty("total_points")
    private Integer totalPoints;
    @JsonProperty("penalties_saved")
    private Integer penaltiesSaved;
    @JsonProperty("in_dreamteam")
    private Boolean inDreamteam;
    @JsonProperty("minutes")
    private Integer minutes;

    @JsonProperty("yellow_cards")
    public Integer getYellowCards() {
        return yellowCards;
    }

    @JsonProperty("yellow_cards")
    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    @JsonProperty("own_goals")
    public Integer getOwnGoals() {
        return ownGoals;
    }

    @JsonProperty("own_goals")
    public void setOwnGoals(Integer ownGoals) {
        this.ownGoals = ownGoals;
    }

    @JsonProperty("creativity")
    public Integer getCreativity() {
        return creativity;
    }

    @JsonProperty("creativity")
    public void setCreativity(Integer creativity) {
        this.creativity = creativity;
    }

    @JsonProperty("goals_conceded")
    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    @JsonProperty("goals_conceded")
    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    @JsonProperty("bonus")
    public Integer getBonus() {
        return bonus;
    }

    @JsonProperty("bonus")
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @JsonProperty("red_cards")
    public Integer getRedCards() {
        return redCards;
    }

    @JsonProperty("red_cards")
    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    @JsonProperty("saves")
    public Integer getSaves() {
        return saves;
    }

    @JsonProperty("saves")
    public void setSaves(Integer saves) {
        this.saves = saves;
    }

    @JsonProperty("influence")
    public Integer getInfluence() {
        return influence;
    }

    @JsonProperty("influence")
    public void setInfluence(Integer influence) {
        this.influence = influence;
    }

    @JsonProperty("bps")
    public Integer getBps() {
        return bps;
    }

    @JsonProperty("bps")
    public void setBps(Integer bps) {
        this.bps = bps;
    }

    @JsonProperty("clean_sheets")
    public Integer getCleanSheets() {
        return cleanSheets;
    }

    @JsonProperty("clean_sheets")
    public void setCleanSheets(Integer cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    @JsonProperty("ict_index")
    public Integer getIctIndex() {
        return ictIndex;
    }

    @JsonProperty("ict_index")
    public void setIctIndex(Integer ictIndex) {
        this.ictIndex = ictIndex;
    }

    @JsonProperty("goals_scored")
    public Integer getGoalsScored() {
        return goalsScored;
    }

    @JsonProperty("goals_scored")
    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    @JsonProperty("threat")
    public Integer getThreat() {
        return threat;
    }

    @JsonProperty("threat")
    public void setThreat(Integer threat) {
        this.threat = threat;
    }

    @JsonProperty("penalties_missed")
    public Integer getPenaltiesMissed() {
        return penaltiesMissed;
    }

    @JsonProperty("penalties_missed")
    public void setPenaltiesMissed(Integer penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
    }

    @JsonProperty("total_points")
    public Integer getTotalPoints() {
        return totalPoints;
    }

    @JsonProperty("total_points")
    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    @JsonProperty("penalties_saved")
    public Integer getPenaltiesSaved() {
        return penaltiesSaved;
    }

    @JsonProperty("penalties_saved")
    public void setPenaltiesSaved(Integer penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    @JsonProperty("in_dreamteam")
    public Boolean getInDreamteam() {
        return inDreamteam;
    }

    @JsonProperty("in_dreamteam")
    public void setInDreamteam(Boolean inDreamteam) {
        this.inDreamteam = inDreamteam;
    }

    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

}
