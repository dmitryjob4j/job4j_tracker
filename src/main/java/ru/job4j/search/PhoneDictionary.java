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
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().contains(key) || persons.get(i).getSurname().contains(key)
                    || persons.get(i).getPhone().contains(key) || persons.get(i).getAddress().contains(key)) {
                result.add(new Person(
                        persons.get(i).getName(), persons.get(i).getSurname(),
                        persons.get(i).getPhone(), persons.get(i).getAddress()
                ));
            }
        }
        return result;
    }
}
