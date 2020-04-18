package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Паспорт и жители.[#242856]
 * Задачаю.
 * Клаcc PassportOffice метод add добовляет, метод get возврощает.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 18.04.2020
 */
public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passoprt) {
        Citizen rsl = null;
            if (citizens.containsKey(passoprt)) {
                rsl = citizens.get(passoprt);
            }
        return rsl;
    }
}
