package com.dupel.labs.task4;

public class Subject {
    private String title;
    private Integer coplexity;

    public Subject(String title, Integer complexity){
        this.title = title;
        this.coplexity = complexity;
    }

    public Integer getCoplexity() {
        return coplexity;
    }

    public String getTitle() {
        return title;
    }
}
