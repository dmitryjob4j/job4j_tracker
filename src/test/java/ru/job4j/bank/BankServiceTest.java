package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * 3. Банковские переводы.[#242857]
 * тесты
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 18.04.2020
 */
public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPasport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 105D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void whenEnterInvalidRequisit() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 105D));
        assertNull(bank.findByRequisite("3434", "123"));
    }

    @Test
    public void findByRequisitTrue() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 105D));
        bank.addAccount(user.getPassport(), new Account("3322", 13D));
        assertThat(bank.findByRequisite("3434", "5546"), is(new Account("5546", 13D)));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Dmitry Stepanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("3322", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "3322", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "3322").getBalance(), is(200D));
    }
}
