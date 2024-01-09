package com.myExamTask3;

public class Phone implements PhoneInterface {

    private String brand;
    private String name;
    private String password;
    private Contact[] contacts;

    public Phone(String brand, String name, String password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }


    @Override
    public String turnOn(String password) {
        if (!this.password.equals(password)) {
            return "Wrong password!";
        } else {
            return "Phone is turned on!";
        }
    }

    @Override
    public String call(String fullName) {
        for (Contact c : contacts) {
            if (!c.getFullName().equals(fullName)) {
                return "You don't have contact with name: " + fullName;
            } else {
                return "You call to " + c.getFullName() + "\n" +
                        "number is: " + c.getPhoneNumber();
            }
        }
        return null;
    }

    @Override
    public String call(int phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber() == phoneNumber) {
                return "You call number is: " + phoneNumber + "\n," +
                        "and name is: " + c.getFullName();
            } else {
                return "You don't have like this contacts";
            }
        }
        return null;
    }

    @Override
    public Contact searchContact(String fullName) {
        for (Contact c : contacts) {
            if (c.getFullName().equals(fullName)) {
                return c;
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public Contact updateName(String oldName, String newName) {
        Contact contact = searchContact(oldName);
        contact.setFullName(newName);
        return contact;
    }

    @Override
    public Contact[] getAllContacts() {
        return contacts;
    }
}

