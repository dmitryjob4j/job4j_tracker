package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * 3. Jdk 1.9, 1.10 Нововведения.
 * 3. Optional в банковских переводах.[#242715]
 * 6. Тестовое задание из модуля коллекции Lite переделать на Stream API.[#242704]
 * тесты
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 06.05.2020
 */
public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPasport("3434").get(), is(user));
    }

    @Test
    public void findByPassportInvali() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPasport("34"), is(Optional.empty()));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 105D));
        assertThat(bank.findByRequisite("34", "5546"), is(Optional.empty()));
    }

    @Test
    public void whenEnterInvalidRequisit() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 105D));
        assertThat(bank.findByRequisite("3434", "123"), is(Optional.empty()));
    }

    @Test
    public void findByRequisitTrue() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 105D));
        bank.addAccount(user.getPassport(), new Account("3322", 13D));
        assertThat(bank.findByRequisite("3434", "5546").get(), is(new Account("5546", 13D)));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("3322", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "3322", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "3322").get().getBalance(), is(200D));
    }
}
