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
public class Account {
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public Account setRequisite(String requisite) {
        this.requisite = requisite;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public Account setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
