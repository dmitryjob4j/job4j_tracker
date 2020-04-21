package ru.job4j.collection;

import java.util.Objects;

/**
 * 1. Организовать сортировку User[#242843]
 * задание.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(age, o.age);
    }
}
