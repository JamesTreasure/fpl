
package com.jamestreasure.fantasyfootball.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fixture {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("kickoff_time_formatted")
    private String kickoffTimeFormatted;
    @JsonProperty("started")
    private Boolean started;
    @JsonProperty("event_day")
    private Integer eventDay;
    @JsonProperty("deadline_time")
    private String deadlineTime;
    @JsonProperty("deadline_time_formatted")
    private String deadlineTimeFormatted;
    @JsonProperty("stats")
    private List<Stat> stats = null;
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("kickoff_time")
    private String kickoffTime;
    @JsonProperty("team_h_score")
    private Integer teamHScore;
    @JsonProperty("team_a_score")
    private Integer teamAScore;
    @JsonProperty("finished")
    private Boolean finished;
    @JsonProperty("minutes")
    private Integer minutes;
    @JsonProperty("provisional_start_time")
    private Boolean provisionalStartTime;
    @JsonProperty("finished_provisional")
    private Boolean finishedProvisional;
    @JsonProperty("event")
    private Integer event;
    @JsonProperty("team_a")
    private Integer teamA;
    @JsonProperty("team_h")
    private Integer teamH;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("kickoff_time_formatted")
    public String getKickoffTimeFormatted() {
        return kickoffTimeFormatted;
    }

    @JsonProperty("kickoff_time_formatted")
    public void setKickoffTimeFormatted(String kickoffTimeFormatted) {
        this.kickoffTimeFormatted = kickoffTimeFormatted;
    }

    @JsonProperty("started")
    public Boolean getStarted() {
        return started;
    }

    @JsonProperty("started")
    public void setStarted(Boolean started) {
        this.started = started;
    }

    @JsonProperty("event_day")
    public Integer getEventDay() {
        return eventDay;
    }

    @JsonProperty("event_day")
    public void setEventDay(Integer eventDay) {
        this.eventDay = eventDay;
    }

    @JsonProperty("deadline_time")
    public String getDeadlineTime() {
        return deadlineTime;
    }

    @JsonProperty("deadline_time")
    public void setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    @JsonProperty("deadline_time_formatted")
    public String getDeadlineTimeFormatted() {
        return deadlineTimeFormatted;
    }

    @JsonProperty("deadline_time_formatted")
    public void setDeadlineTimeFormatted(String deadlineTimeFormatted) {
        this.deadlineTimeFormatted = deadlineTimeFormatted;
    }

    @JsonProperty("stats")
    public List<Stat> getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonProperty("kickoff_time")
    public String getKickoffTime() {
        return kickoffTime;
    }

    @JsonProperty("kickoff_time")
    public void setKickoffTime(String kickoffTime) {
        this.kickoffTime = kickoffTime;
    }

    @JsonProperty("team_h_score")
    public Integer getTeamHScore() {
        return teamHScore;
    }

    @JsonProperty("team_h_score")
    public void setTeamHScore(Integer teamHScore) {
        this.teamHScore = teamHScore;
    }

    @JsonProperty("team_a_score")
    public Integer getTeamAScore() {
        return teamAScore;
    }

    @JsonProperty("team_a_score")
    public void setTeamAScore(Integer teamAScore) {
        this.teamAScore = teamAScore;
    }

    @JsonProperty("finished")
    public Boolean getFinished() {
        return finished;
    }

    @JsonProperty("finished")
    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    @JsonProperty("provisional_start_time")
    public Boolean getProvisionalStartTime() {
        return provisionalStartTime;
    }

    @JsonProperty("provisional_start_time")
    public void setProvisionalStartTime(Boolean provisionalStartTime) {
        this.provisionalStartTime = provisionalStartTime;
    }

    @JsonProperty("finished_provisional")
    public Boolean getFinishedProvisional() {
        return finishedProvisional;
    }

    @JsonProperty("finished_provisional")
    public void setFinishedProvisional(Boolean finishedProvisional) {
        this.finishedProvisional = finishedProvisional;
    }

    @JsonProperty("event")
    public Integer getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(Integer event) {
        this.event = event;
    }

    @JsonProperty("team_a")
    public Integer getTeamA() {
        return teamA;
    }

    @JsonProperty("team_a")
    public void setTeamA(Integer teamA) {
        this.teamA = teamA;
    }

    @JsonProperty("team_h")
    public Integer getTeamH() {
        return teamH;
    }

    @JsonProperty("team_h")
    public void setTeamH(Integer teamH) {
        this.teamH = teamH;
    }

}
