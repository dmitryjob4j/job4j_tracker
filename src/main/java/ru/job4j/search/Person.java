package ru.job4j.search;

/**
 * 1. Телефонный справочник на базе ArrayList[#242847]
 * Задание
 * @author Dmitry Stepanov
 * @version 1
 * @since 13.04.2020
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
