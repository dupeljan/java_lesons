package com.dupel.labs.task4;

import java.util.ArrayList;
import java.util.List;

public class Group {
    int code;
    List<Student> students;
    Speciality speciality;

    public Group(int code, List <Student> students, Speciality speciality) {
        this.code = code;
        this.speciality = speciality;
        this.students = students;
    }

    public boolean containsStudent(Student student) {

        for (Student eachStudent: students)  // Array.asList(student).contains()-???
            if (eachStudent.equals(student)) return true;

        return false;
    }

    public int getCode() {
        return code;
    }

    public Speciality getSpeciality() {
        return speciality;
    }
}
