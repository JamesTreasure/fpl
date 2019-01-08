package com.jamestreasure.fantasyfootball.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LeagueDto {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("leagueban_set")
    private List<Object> leaguebanSet = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("short_name")
    private Object shortName;
    @JsonProperty("created")
    private String created;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("forum_disabled")
    private Boolean forumDisabled;
    @JsonProperty("make_code_public")
    private Boolean makeCodePublic;
    @JsonProperty("rank")
    private Object rank;
    @JsonProperty("size")
    private Object size;
    @JsonProperty("league_type")
    private String leagueType;
    @JsonProperty("_scoring")
    private String scoring;
    @JsonProperty("reprocess_standings")
    private Boolean reprocessStandings;
    @JsonProperty("admin_entry")
    private Integer adminEntry;
    @JsonProperty("start_event")
    private Integer startEvent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("leagueban_set")
    public List<Object> getLeaguebanSet() {
        return leaguebanSet;
    }

    @JsonProperty("leagueban_set")
    public void setLeaguebanSet(List<Object> leaguebanSet) {
        this.leaguebanSet = leaguebanSet;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("short_name")
    public Object getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(Object shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("forum_disabled")
    public Boolean getForumDisabled() {
        return forumDisabled;
    }

    @JsonProperty("forum_disabled")
    public void setForumDisabled(Boolean forumDisabled) {
        this.forumDisabled = forumDisabled;
    }

    @JsonProperty("make_code_public")
    public Boolean getMakeCodePublic() {
        return makeCodePublic;
    }

    @JsonProperty("make_code_public")
    public void setMakeCodePublic(Boolean makeCodePublic) {
        this.makeCodePublic = makeCodePublic;
    }

    @JsonProperty("rank")
    public Object getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Object rank) {
        this.rank = rank;
    }

    @JsonProperty("size")
    public Object getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Object size) {
        this.size = size;
    }

    @JsonProperty("league_type")
    public String getLeagueType() {
        return leagueType;
    }

    @JsonProperty("league_type")
    public void setLeagueType(String leagueType) {
        this.leagueType = leagueType;
    }

    @JsonProperty("_scoring")
    public String getScoring() {
        return scoring;
    }

    @JsonProperty("_scoring")
    public void setScoring(String scoring) {
        this.scoring = scoring;
    }

    @JsonProperty("reprocess_standings")
    public Boolean getReprocessStandings() {
        return reprocessStandings;
    }

    @JsonProperty("reprocess_standings")
    public void setReprocessStandings(Boolean reprocessStandings) {
        this.reprocessStandings = reprocessStandings;
    }

    @JsonProperty("admin_entry")
    public Integer getAdminEntry() {
        return adminEntry;
    }

    @JsonProperty("admin_entry")
    public void setAdminEntry(Integer adminEntry) {
        this.adminEntry = adminEntry;
    }

    @JsonProperty("start_event")
    public Integer getStartEvent() {
        return startEvent;
    }

    @JsonProperty("start_event")
    public void setStartEvent(Integer startEvent) {
        this.startEvent = startEvent;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}