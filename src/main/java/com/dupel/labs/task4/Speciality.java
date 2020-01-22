package com.dupel.labs.task4;

import java.util.List;

public class Speciality {
    private  String title;
    private List<Subject> subjects;
    public Speciality(String title, List<Subject> subjects){
        this.subjects = subjects;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
