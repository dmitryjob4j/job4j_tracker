package ru.job4j.bank;

import java.util.Objects;

/**
 * 3. Банковские переводы.[#242857]
 * модель данных
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 18.04.2020
 */
public class User {
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public User setPassport(String passport) {
        this.passport = passport;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
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
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
