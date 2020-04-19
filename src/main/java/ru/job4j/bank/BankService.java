package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 3. Банковские переводы.[#242857]
 * задача.
 *
 * @author Dmitry Stepanov
 * @version 3
 * @since 18.04.2020
 */
public class BankService {
    /**
     * Все пользователи системы с привязанными к ним счетами.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добовление пользовотелей в сиситему
     *
     * @param user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавление нового счета к пользователю.
     *
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPasport(passport);
        if (user != null && users.get(user).indexOf(account) == -1) {
            users.get(user).add(account);
        }
    }

    /**
     * Ишем пользовотеля по паспорту.
     *
     * @param passport
     * @return
     */
    public User findByPasport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Ищет счет пользователя по реквизитам.
     *
     * @param passport
     * @param requisite
     * @return
     */
    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPasport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            for (Account value : accountList) {
                if (value.getRequisite().equals(requisite)) {
                    account = value;
                    break;
                }
            }
        }
        return account;
    }

    /**
     * Перичесление денег с одного счета на другой.
     *
     * @param scrPassport
     * @param scrRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String scrPassport, String scrRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account scrAccount = findByRequisite(scrPassport, scrRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (scrAccount != null && destAccount != null && scrAccount.getBalance() >= amount) {
            scrAccount.setBalance(scrAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
