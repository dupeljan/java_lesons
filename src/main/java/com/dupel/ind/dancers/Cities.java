package com.dupel.ind.dancers;

public class Cities {
    private int cityId;
    private String cityName;

    public Cities(int cityId, String cityName){
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityId() {
        return cityId;
    }
}
