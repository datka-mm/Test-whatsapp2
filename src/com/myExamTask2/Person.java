package com.myExamTask2;

import com.myExamTask2.enums.Role;

public class Person {

    private String name;
    private int age;
    private String email;
    private String login;
    private String password;
    private Role role;
    private TalentLMS talentLMS;

    public Person(String name, int age, String email, String login, String password, Role role, TalentLMS talentLMS) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.login = login;
        this.password = password;
        this.role = role;
        this.talentLMS = talentLMS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public TalentLMS getTalentLMS() {
        return talentLMS;
    }

    public void setTalentLMS(TalentLMS talentLMS) {
        this.talentLMS = talentLMS;
    }
}
