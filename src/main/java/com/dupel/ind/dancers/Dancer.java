package com.dupel.ind.dancers;

public class Dancer {

    private int dancerId;
    private String dancerName;
    private Style dancerStyle;

    public Dancer(int dancerId, String dancerName, Style dancerStyle){
        this.dancerId = dancerId;
        this.dancerName = dancerName;
        this.dancerStyle = dancerStyle;
    }

    public int getDancerId() {
        return dancerId;
    }
    public String getDancerName() {
        return dancerName;
    }
    public Style getDancerStyle() {
        return dancerStyle;
    }
}
