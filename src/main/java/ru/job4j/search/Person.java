package ru.job4j.search;

/**
 * 1. Labmda
 * 6. функции высшего порядка
 * задание
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 01.05.2020
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
