package com.dupel.labs.task4;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScheduleDemo {
    public static void main(String[] args) {
        //LocalDateTime ldt = LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00);

        // initialize Subjects
        Subject analysis = new Subject("analysis",3);
        Subject webDev = new Subject("webDev",1);
        Subject javaLang = new Subject("webDev",1);
        Subject PE = new Subject("PE",-1);
        Subject knoledgeBases = new Subject("knoledgeBases",1);
        Subject linearAlgebra = new Subject("linearAlgebra",100);
        Subject swiftLang = new Subject("swiftLang",-5);
        Subject kotlinLang = new Subject("kotlinLang", 7);
        Subject mobileDev = new Subject("mobileDev",88);

        // initialize students
        Student vova = new Student("Vova");
        Student sasha = new Student("Sasha");
        Student anya = new Student("Anya");
        Student pasha = new Student("Pasha");
        Student denis = new Student("Denis");

        // initialize Speciality
        Speciality appliedMath = new Speciality("appliedMath",Arrays.asList(analysis,webDev,javaLang,PE,knoledgeBases));
        Speciality appliedInformatics = new Speciality("appliedInformatics",Arrays.asList(analysis,webDev,javaLang,PE,knoledgeBases));
        // initialize educators
        Educator malukhin = new Educator("Malukhin", Arrays.asList(analysis));
        Educator sinitsa = new Educator("Sinitsa", Arrays.asList(webDev));
        Educator golovin = new Educator("Golovin", Arrays.asList(javaLang));
        Educator kurilov = new Educator("Kurilov", Arrays.asList(PE));
        Educator kostenko = new Educator("Kostenko", Arrays.asList(knoledgeBases));
        // initialize Groups
        List<Student> tenthGroupStudents = Arrays.asList(vova, sasha);
        Group tenthGroup = new Group(10, tenthGroupStudents, appliedMath);

        List <Student> eleventhGroupStudents = Arrays.asList(anya, pasha, denis);
        Group eleventhGroup = new Group(11, eleventhGroupStudents, appliedInformatics);



        List <Lesson> lessons = Arrays.asList(
        //Lesson lessons[] = {

                // (* 10th *)
                // MONDAY
                new Lesson(1, javaLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00), golovin),
                new Lesson(2, analysis, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 28, 9, 30), malukhin),

                // TUESDAY
                new Lesson(1, webDev, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), sinitsa),
                new Lesson(2, webDev, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 9, 40), sinitsa),
                new Lesson(3, PE, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 11, 30), kurilov),

                // WEDNESDAY
                new Lesson(1, linearAlgebra, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), malukhin),
                new Lesson(2, javaLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 9, 40), golovin),
                new Lesson(3, javaLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 11, 30), golovin),
                new Lesson(4, knoledgeBases, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 13, 00), kostenko),
                new Lesson(5, webDev, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 15, 00), sinitsa),

                // THURSDAY
                new Lesson(1, swiftLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), golovin),
                new Lesson(2, swiftLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 9, 40), golovin),
                new Lesson(3, swiftLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 11, 30), golovin),
                new Lesson(4, swiftLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 13, 00), golovin),

                // FRIDAY
                new Lesson(1, kotlinLang, tenthGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 8, 00), golovin),
                new Lesson(2, kotlinLang, tenthGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 9, 40), golovin),
                new Lesson(3, PE, tenthGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 11, 30), kurilov),
                new Lesson(4, mobileDev, tenthGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 13, 00), golovin),

                //  (* 11th *) ------------------------------------------------------------------------------------------------------------------------------------------

                // MONDAY
                new Lesson(1, knoledgeBases, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00), kostenko),
                new Lesson(2, analysis, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 28, 9, 30), malukhin),

                // TUESDAY
                new Lesson(1, javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), golovin),
                new Lesson(2, analysis, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), malukhin),
                new Lesson(3, linearAlgebra, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), malukhin),

                // WEDNESDAY
                new Lesson(1, webDev, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), sinitsa),
                new Lesson(2, webDev, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 9, 40), sinitsa),
                new Lesson(3, javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 11, 30), golovin),

                // THURSDAY
                new Lesson(1, javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), golovin),
                new Lesson(2, javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 9, 40), golovin),


                // FRIDAY
                new Lesson(1, knoledgeBases, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 8, 00), kostenko),
                new Lesson(2, javaLang, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 9, 40), golovin),
                new Lesson(3, linearAlgebra, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 11, 30), malukhin),
                new Lesson(4, webDev, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 13, 00), sinitsa)
        //};
        );

        Schedule nextWeekSchedule = new Schedule(lessons, Arrays.asList(tenthGroup, eleventhGroup) );

        nextWeekSchedule.getEducatorSchedule(malukhin);
        nextWeekSchedule.getStudentSchedule(vova);


    }

}
