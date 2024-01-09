package com.myExamTask3;

public interface PhoneInterface {

    String turnOn(String password);

    String call(String fullName);

    String call(int phoneNumber);

    Contact searchContact(String fullName);

    Contact updateName(String oldName, String newName);

    Contact[] getAllContacts();
}
