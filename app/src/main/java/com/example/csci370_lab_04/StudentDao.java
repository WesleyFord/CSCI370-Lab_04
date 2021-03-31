package com.example.csci370_lab_04;

import java.util.ArrayList;

public class StudentDao {
    private ArrayList<Student> studentList;

    public StudentDao() {
        studentList = new ArrayList<Student>();

        studentList.add(new Student("Ford", "Wes", "CS"));
        studentList.add(new Student("Clark", "Sydney", "BIO"));
        studentList.add(new Student("Neff", "Maddie", "EDU"));
        studentList.add(new Student("Bradley", "Nathan", "CITA"));
        studentList.add(new Student("Wright", "Jaime", "ASTRO"));
    }

    public ArrayList<Student> getAllStudents() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
