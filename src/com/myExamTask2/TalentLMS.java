package com.myExamTask2;

public class TalentLMS implements PersonInterface {

    private SignIn signIn;
    private Course[] courses;

    public TalentLMS(SignIn signIn, Course[] courses) {
        this.signIn = signIn;
        this.courses = courses;
    }

    @Override
    public String login(SignIn signIn) {
        for (Course c : courses) {
            for (Person p : c.getStudents()) {
                if (p.getPassword().equals(signIn.getPassword()) && p.getLogin().equals(signIn.getLogin())) {
                    return "Welcome to Talent LMS!";
                } else {
                    return "Login or password is wrong!";
                }
            }
        }
        return null;
    }

    @Override
    public Course getCourseByCourseName(String name) {
        for (Course c : this.courses) {
            if (c.getCourseName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Person[] getAllCourseStudentsByCourseName(String name) {
        Person[] people = {};
        for (Course c : courses) {
            if (c.getCourseName().equals(name)) {
                people = c.getStudents();
            }
        }
        return people;
    }

    @Override
    public Person sortStudentByStudentsAge() {
        return null;
    }

    @Override
    public Person getStudentByEmail(String email) {
        for (Course c : courses) {
            for (Person p : c.getStudents()) {
                if (p.getEmail().equals(email)) {
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public Person getTeacherByCourseName(String courseName) {
        for (Course c : courses) {
            if (c.getCourseName().equals(courseName)) {
                return c.getTeacher();
            }
        }
        return null;
    }
}
