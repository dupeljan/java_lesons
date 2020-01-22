package com.dupel.labs.task4;

import java.util.List;

public class Educator extends Member {
    private List<Subject> subject;
    //String degree;
    //double salary;

    public Educator(String name, List<Subject> subject) {
        this.name = name;
        this.subject = subject;
    }
}
