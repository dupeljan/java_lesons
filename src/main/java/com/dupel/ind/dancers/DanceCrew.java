package com.dupel.ind.dancers;

import java.util.List;

public class DanceCrew {
    private int crewId;
    private String crewName;
    private List<Dancer> dancers;

    public DanceCrew(int crewId, String crewName, List<Dancer> dancers) {
        this.crewId = crewId;
        this.crewName = crewName;
        this.dancers = dancers;
    }

    public String getCrewName() {
        return crewName;
    }
    public int getCrewId() {
        return crewId;
    }
    public List<Dancer> getDancers() {
        return dancers;
    }
}
