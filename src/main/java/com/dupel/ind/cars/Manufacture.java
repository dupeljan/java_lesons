package com.dupel.ind.cars;



import java.util.Date;

public class Manufacture {
    private String title;
    private String location;
    private String foundationDate;

    public Manufacture(String title, String location, String foundationDate) {
        this.title = title;
        this.location = location;
        this.foundationDate = foundationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String  getFoundationDate() {
        return foundationDate;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", foundationDate=" + foundationDate +
                '}';
    }
}
