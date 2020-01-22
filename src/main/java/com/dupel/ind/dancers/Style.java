package com.dupel.ind.dancers;

public class Style {

    private int styleId;
    private String styleName;

    public Style(int styleId, String styleName){
        this.styleId = styleId;
        this.styleName = styleName;
    }

    public String getStyleName() {
        return styleName;
    }
    public int getStyleId() {
        return styleId;
    }
}
