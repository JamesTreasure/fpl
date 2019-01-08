package com.jamestreasure.fantasyfootball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("deadline_time")
    private String deadlineTime;
    @JsonProperty("average_entry_score")
    private Integer averageEntryScore;
    @JsonProperty("finished")
    private Boolean finished;
    @JsonProperty("data_checked")
    private Boolean dataChecked;
    @JsonProperty("highest_scoring_entry")
    private Integer highestScoringEntry;
    @JsonProperty("deadline_time_epoch")
    private Integer deadlineTimeEpoch;
    @JsonProperty("deadline_time_game_offset")
    private Integer deadlineTimeGameOffset;
    @JsonProperty("deadline_time_formatted")
    private String deadlineTimeFormatted;
    @JsonProperty("highest_score")
    private Integer highestScore;
    @JsonProperty("is_previous")
    private Boolean isPrevious;
    @JsonProperty("is_current")
    private Boolean isCurrent;
    @JsonProperty("is_next")
    private Boolean isNext;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("deadline_time")
    public String getDeadlineTime() {
        return deadlineTime;
    }

    @JsonProperty("deadline_time")
    public void setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    @JsonProperty("average_entry_score")
    public Integer getAverageEntryScore() {
        return averageEntryScore;
    }

    @JsonProperty("average_entry_score")
    public void setAverageEntryScore(Integer averageEntryScore) {
        this.averageEntryScore = averageEntryScore;
    }

    @JsonProperty("finished")
    public Boolean getFinished() {
        return finished;
    }

    @JsonProperty("finished")
    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    @JsonProperty("data_checked")
    public Boolean getDataChecked() {
        return dataChecked;
    }

    @JsonProperty("data_checked")
    public void setDataChecked(Boolean dataChecked) {
        this.dataChecked = dataChecked;
    }

    @JsonProperty("highest_scoring_entry")
    public Integer getHighestScoringEntry() {
        return highestScoringEntry;
    }

    @JsonProperty("highest_scoring_entry")
    public void setHighestScoringEntry(Integer highestScoringEntry) {
        this.highestScoringEntry = highestScoringEntry;
    }

    @JsonProperty("deadline_time_epoch")
    public Integer getDeadlineTimeEpoch() {
        return deadlineTimeEpoch;
    }

    @JsonProperty("deadline_time_epoch")
    public void setDeadlineTimeEpoch(Integer deadlineTimeEpoch) {
        this.deadlineTimeEpoch = deadlineTimeEpoch;
    }

    @JsonProperty("deadline_time_game_offset")
    public Integer getDeadlineTimeGameOffset() {
        return deadlineTimeGameOffset;
    }

    @JsonProperty("deadline_time_game_offset")
    public void setDeadlineTimeGameOffset(Integer deadlineTimeGameOffset) {
        this.deadlineTimeGameOffset = deadlineTimeGameOffset;
    }

    @JsonProperty("deadline_time_formatted")
    public String getDeadlineTimeFormatted() {
        return deadlineTimeFormatted;
    }

    @JsonProperty("deadline_time_formatted")
    public void setDeadlineTimeFormatted(String deadlineTimeFormatted) {
        this.deadlineTimeFormatted = deadlineTimeFormatted;
    }

    @JsonProperty("highest_score")
    public Integer getHighestScore() {
        return highestScore;
    }

    @JsonProperty("highest_score")
    public void setHighestScore(Integer highestScore) {
        this.highestScore = highestScore;
    }

    @JsonProperty("is_previous")
    public Boolean getIsPrevious() {
        return isPrevious;
    }

    @JsonProperty("is_previous")
    public void setIsPrevious(Boolean isPrevious) {
        this.isPrevious = isPrevious;
    }

    @JsonProperty("is_current")
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    @JsonProperty("is_current")
    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    @JsonProperty("is_next")
    public Boolean getIsNext() {
        return isNext;
    }

    @JsonProperty("is_next")
    public void setIsNext(Boolean isNext) {
        this.isNext = isNext;
    }

}