package ru.job4j.bank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 6. Тестовое задание из модуля коллекции Lite переделать на Stream API.[#242704]
 * задача.
 *
 * @author Dmitry Stepanov
 * @version 2
 * @since 04.05.2020
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
        if (user != null && !users.get(user).contains(account)) {
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
        User rsl = users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findAny().orElse(null);
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
        User user = findByPasport(passport);
        Account account = user == null ? null : users.get(user)
                .stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findAny().orElse(null);
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
        if (scrAccount != null
                && destAccount != null
                && scrAccount.getBalance() >= amount) {
            scrAccount.setBalance(scrAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
