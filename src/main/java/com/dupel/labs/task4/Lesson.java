package com.dupel.labs.task4;

import java.time.LocalDateTime;

public class Lesson implements Comparable<Lesson> {
    private int number; // ?
    private Subject subject;
    private Group group;
    private LocalDateTime time;
    private Educator educator;

    public Lesson(int number, Subject subject, Group group, LocalDateTime time, Educator educator) {
        this.number = number;;
        this.subject = subject;
        this.group = group;
        this.time = time;
        this.educator = educator;
    }

    @Override
    public int compareTo(Lesson lesson) {
        if (this.time == null || lesson.time == null)
            return 0;

        return this.time.compareTo(lesson.time);
    }

    public int getNumber() {
        return number;
    }

    public Subject getSubject() {
        return subject;
    }

    public Educator getEducator() {
        return educator;
    }

    public Group getGroup() {
        return group;
    }

    public LocalDateTime getTime() {
        return time;
    }
}

