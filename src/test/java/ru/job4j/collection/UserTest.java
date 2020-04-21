package ru.job4j.collection;

import org.junit.Test;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * 1. Организовать сортировку User[#242843]
 * тест.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        users.add(new User("Petr", 33));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
        assertThat(it.next(), is(new User("Petr", 33)));
    }

    @Test
    public void whenComparePetrVSIvan() {
        int rsl = new User("Petr", 32).
                compareTo(new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }
}
