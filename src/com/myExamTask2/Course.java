package com.myExamTask2;

import java.time.LocalDate;

public class Course {

    private String courseName;
    private LocalDate dateOfStart;
    private Person teacher;
    private Person[] students;
    private Lesson[] lessons;

    public Course(String courseName, LocalDate dateOfStart, Person teacher, Person[] students, Lesson[] lessons) {
        this.courseName = courseName;
        this.dateOfStart = dateOfStart;
        this.teacher = teacher;
        this.students = students;
        this.lessons = lessons;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public Person[] getStudents() {
        return students;
    }

    public void setStudents(Person[] students) {
        this.students = students;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }
}
