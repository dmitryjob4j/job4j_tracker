package ru.job4j.search;

import java.util.ArrayList;

/**
 * 1. Телефонный справочник на базе ArrayList[#242847]
 * Задание.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 13.04.2020
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
        for (Person value : persons) {
            if (value.getName().contains(key) || value.getSurname().contains(key) || value.getPhone().contains(key) || value.getAddress().contains(key)) {
                result.add(new Person(value.getName(), value.getSurname(), value.getPhone(), value.getAddress()));
            }
        }
        return result;
    }
}
