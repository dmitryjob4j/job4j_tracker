package ru.job4j.bank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 3. Jdk 1.9, 1.10 Нововведения.
 * 3. Optional в банковских переводах.[#242715]
 * 6. Тестовое задание из модуля коллекции Lite переделать на Stream API.[#242704]
 * задача.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 06.05.2020
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
        Optional<User> user = findByPasport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Ишем пользовотеля по паспорту.
     *
     * @param passport
     * @return
     */
    public Optional<User> findByPasport(String passport) {
        Optional<User> rsl = users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findAny();
        return rsl;
    }

    /**
     * Ищет счет пользователя по реквизитам.
     *
     * @param passport
     * @param requisite
     * @return
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPasport(passport);
        Optional<Account> account = !user.isPresent() ? Optional.empty() : users.get(user.get())
                .stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findAny();
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
        Optional<Account> scrAccount = findByRequisite(scrPassport, scrRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (scrAccount.isPresent()
                && destAccount.isPresent()
                && scrAccount.get().getBalance() >= amount) {
            scrAccount.get().setBalance(scrAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
