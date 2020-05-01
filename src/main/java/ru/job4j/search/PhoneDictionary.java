package ru.job4j.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

/**
 * 1. Labmda
 * 6. функции высшего порядка
 * задание
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 01.05.2020
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержит key в любых полях Person
     *
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<Person>();
       /* for (Person person : persons) {
            if (person.getName().contains(key) || person.getSurname().contains(key) || person.getPhone().contains(key) || person.getAddress().contains(key)) {
                result.add(person);
            }
        }*/
        Predicate<Person> combine = x -> x.getName().contains(key)
                || x.getSurname().contains(key)
                || x.getPhone().contains(key)
                || x.getAddress().contains(key);
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
