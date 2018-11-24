
package com.jamestreasure.fantasyfootball.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class _1 {

    @JsonProperty("explain")
    private List<List<Explain>> explain = null;
    @JsonProperty("stats")
    private Stats stats;

    @JsonProperty("explain")
    public List<List<Explain>> getExplain() {
        return explain;
    }

    @JsonProperty("explain")
    public void setExplain(List<List<Explain>> explain) {
        this.explain = explain;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

}
