package ru.job4j.collection;

import java.util.Objects;

/**
 * 1. Паспорт и жители.[#242856]
 * Задача
 * Клаcc Citizen модель данных passport username.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 18.04.2020
 */
public class Citizen {
    private String passport;
    private String username;

    public Citizen(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }
    public String getPassport() {
        return passport;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return Objects.equals(passport, citizen.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
