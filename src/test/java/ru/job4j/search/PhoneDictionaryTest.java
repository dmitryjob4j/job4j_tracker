package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 1. Labmda
 * 6. функции высшего порядка
 * Задание
 * Тест
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 13.04.2020
 */
public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Dmitry", "Stepanov", "928900", "Krasnodar")
        );
        ArrayList<Person> persons = phones.find("mit");
        assertThat(persons.get(0).getSurname(), is("Stepanov"));
    }
}
