package com.jamestreasure.fantasyfootball.dto;

public class CurrentGameweek {

    private Integer currentGameweek;
    private Boolean live;

    public Integer getCurrentGameweek() {
        return currentGameweek;
    }

    public void setCurrentGameweek(Integer currentGameweek) {
        this.currentGameweek = currentGameweek;
    }

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }


}
