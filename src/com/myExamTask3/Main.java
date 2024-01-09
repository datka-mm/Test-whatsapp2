package com.myExamTask3;

public class Main {

    //////////////////////
    /**
     * 2 класс тузунуз
     * Contact(phoneNumber, fullName)
     * Phone(brand, name, password, Contacts[] contacts)
     * PhoneInterface деген interface тузунуз, turnOn(); телефонду жандырат, пароль сурайт анан ошол пароль туура болсо "Телефон жанды" деп кайтарат метод.
     * call(); call(); деген 2 метод бар бироосу параметрине телефон номер сурайт анан издейт эгер тапса номер менен ошол номерди жана ошол номер кандай атта сакталган болсо ошол аты менен чалып жатасыз деп кайтарып берет
     * дагы бир методу атын жазасыз эгер ошол ат менен сакталган контакт табылса ошол контакттын атын жана ошол номерди кайтарып ушуга чалып жатасыз деп кайтарып берет
     * searchContact(); деген методдун жардамы менен контакттарды издейсиз параметрине бир контактын аты жазылат, ошол ат менен контакт табылса ошол контакты(Contact) кайтарып берет
     * Contact updateName(); бул методдун жардамы менен контакттын атын озгортсо болот, параметрине 2 соз алат ( эскиАты, жаныАты)
     * getAllContacts(); бул метод бир телефондун ичиндеги контактардын баарын алып берет
     * main - ден класстардын объееттерин тузуп программанызды иштетиниз
     *
     * @param args
     */
    public static void main(String[] args) {
        Contact contact = new Contact(1234567, "DatkaM");
        Contact contact1 = new Contact(1492, "DD");
        Contact contact2 = new Contact(23928, "KD");
        Contact contact3 = new Contact(2937, "KDM");
        Phone phone = new Phone("Apple", "IPhone", "password", new Contact[]{contact, contact1, contact2, contact3});
        System.out.println(phone.turnOn("password"));
        System.out.println(phone.call("DD"));
//        System.out.println(phone.call(1492));
//        System.out.println(phone.searchContact("KDM"));
//        System.out.println(phone.updateName("DatkaM", "DM"));
//        System.out.println(Arrays.toString(phone.getAllContacts()));
    }
}
