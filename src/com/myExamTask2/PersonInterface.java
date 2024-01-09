package com.myExamTask2;

public interface PersonInterface {

    String login(SignIn signIn);

    Course getCourseByCourseName(String name);

    Person[] getAllCourseStudentsByCourseName(String name);

    Person sortStudentByStudentsAge();

    Person getStudentByEmail(String email);

    Person getTeacherByCourseName(String courseName);

}
