package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * 3. Модели данных и HashSet.[#242862]
 * Задача
 * Клаcc Notify метод sent уникальный список для рассылки сравнивая по номеру полю passport модели данных Account.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 17.04.2020
 */
public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account : accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}
