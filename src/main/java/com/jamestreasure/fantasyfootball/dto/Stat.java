
package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stat {

    @JsonProperty("goals_scored")
    private GoalsScored goalsScored;
    @JsonProperty("assists")
    private Assists assists;
    @JsonProperty("own_goals")
    private OwnGoals ownGoals;
    @JsonProperty("penalties_saved")
    private PenaltiesSaved penaltiesSaved;
    @JsonProperty("penalties_missed")
    private PenaltiesMissed penaltiesMissed;
    @JsonProperty("yellow_cards")
    private YellowCards yellowCards;
    @JsonProperty("red_cards")
    private RedCards redCards;
    @JsonProperty("saves")
    private Saves saves;
    @JsonProperty("bonus")
    private Bonus bonus;
    @JsonProperty("bps")
    private Bps bps;

    @JsonProperty("goals_scored")
    public GoalsScored getGoalsScored() {
        return goalsScored;
    }

    @JsonProperty("goals_scored")
    public void setGoalsScored(GoalsScored goalsScored) {
        this.goalsScored = goalsScored;
    }

    @JsonProperty("assists")
    public Assists getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Assists assists) {
        this.assists = assists;
    }

    @JsonProperty("own_goals")
    public OwnGoals getOwnGoals() {
        return ownGoals;
    }

    @JsonProperty("own_goals")
    public void setOwnGoals(OwnGoals ownGoals) {
        this.ownGoals = ownGoals;
    }

    @JsonProperty("penalties_saved")
    public PenaltiesSaved getPenaltiesSaved() {
        return penaltiesSaved;
    }

    @JsonProperty("penalties_saved")
    public void setPenaltiesSaved(PenaltiesSaved penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    @JsonProperty("penalties_missed")
    public PenaltiesMissed getPenaltiesMissed() {
        return penaltiesMissed;
    }

    @JsonProperty("penalties_missed")
    public void setPenaltiesMissed(PenaltiesMissed penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
    }

    @JsonProperty("yellow_cards")
    public YellowCards getYellowCards() {
        return yellowCards;
    }

    @JsonProperty("yellow_cards")
    public void setYellowCards(YellowCards yellowCards) {
        this.yellowCards = yellowCards;
    }

    @JsonProperty("red_cards")
    public RedCards getRedCards() {
        return redCards;
    }

    @JsonProperty("red_cards")
    public void setRedCards(RedCards redCards) {
        this.redCards = redCards;
    }

    @JsonProperty("saves")
    public Saves getSaves() {
        return saves;
    }

    @JsonProperty("saves")
    public void setSaves(Saves saves) {
        this.saves = saves;
    }

    @JsonProperty("bonus")
    public Bonus getBonus() {
        return bonus;
    }

    @JsonProperty("bonus")
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    @JsonProperty("bps")
    public Bps getBps() {
        return bps;
    }

    @JsonProperty("bps")
    public void setBps(Bps bps) {
        this.bps = bps;
    }

}
