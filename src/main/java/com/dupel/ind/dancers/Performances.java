package com.dupel.ind.dancers;

import java.time.LocalDateTime;

public class Performances {

    private int performanceId;
    private Cities performancePlace;
    private LocalDateTime dateTime;
    private DanceCrew danceCrew;

    public Performances(int performanceId, Cities performancePlace, DanceCrew danceCrew, LocalDateTime dateTime){
        this.performanceId = performanceId;
        this.performancePlace = performancePlace;
        this.danceCrew = danceCrew;
        this.dateTime = dateTime;
    }

    public int getPerformanceId() {
        return performanceId;
    }

    public DanceCrew getDanceCrew() {
        return danceCrew;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Cities getPerformancePlace() {
        return performancePlace;
    }
}
