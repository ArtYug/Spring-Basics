package com.geekbrains.spring_homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("com.geekbrains.spring_homework");
        Person person = context.getBean(Person.class);
        Timetable timetable = context.getBean(Timetable.class);
        PatientArchive patientArchive = context.getBean(PatientArchive.class);
        //ReferralToDentist referral = context.getBean(ReferralToDentist.class);
        person.setName("valera");
        patientArchive.timeToDoctor(person, 12);
        timetable.referral();
        Person person2 = context.getBean(Person.class);
        person2.setName("ra");
        patientArchive.timeToDoctor(person2, 13);
        timetable.referral();
    }
}
