package com.dupel.labs.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Schedule {
    List<Lesson> lessons;
    List <Group> groups;

    public Schedule(List<Lesson> lessons, List <Group> groups) {
        this.lessons = lessons;
        this.groups = groups;
    }

    // methods for getting result
    public List<Lesson> getEducatorSchedule(Educator educator) {

        List<Lesson> desiredLessons = new ArrayList<Lesson>();

        System.out.println("\n \n Here is the schedule for educator " + educator.name + " for next week:");

        for (Lesson eachLesson : this.lessons)
            if (educator.equals(eachLesson.getEducator()))
                desiredLessons.add(eachLesson);


        Collections.sort(desiredLessons);
        prettyLessonOutput(desiredLessons);

        return desiredLessons;
    }

    public List<Lesson> getStudentSchedule(Student student) {

        System.out.println("\n \n Here is the schedule for student " + student.name + " for next week:");

        List<Lesson> desiredLessons = new ArrayList<Lesson>();
        Group desiredGroup = null;

        // find out desired group
        for (Group eachGroup : groups) {
            if (eachGroup.containsStudent(student)) {
                desiredGroup = eachGroup;
                break;
            }
        }

        // guard
        if (desiredGroup == null) {
            System.out.println("ERROR: \n There is no such Student in the groups");
            return desiredLessons;
        }

        // List formation
        for (Lesson eachLesson : this.lessons)
            if (eachLesson.getGroup().equals(desiredGroup))
                desiredLessons.add(eachLesson);


        Collections.sort(desiredLessons);
        prettyLessonOutput(desiredLessons);

        return desiredLessons;
    }

    private void prettyLessonOutput(List<Lesson> lessons) {
        for (Lesson eachLesson : lessons) {
            System.out.println("\n ------------ " + eachLesson.getNumber() + " --------------- ");
            System.out.println("|" + eachLesson.getSubject().getTitle() + "|");
            System.out.println("\t" + eachLesson.getTime().toLocalDate());
            System.out.println("\t" + eachLesson.getTime().toLocalTime());
            System.out.println("\t group: " + eachLesson.getGroup().getSpeciality().getTitle() + " " + Integer.toString(eachLesson.getGroup().getCode()) );
            System.out.println();
        }
    }
}
