package ru.job4j.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * 1. Организовать сортировку User[#242843]
 * пример.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class TreeSort {
    public static void main(String[] args) {
        Set<String> name = new TreeSet<>();
        name.add("Dima");
        name.add("Ben");
        name.add("Fedr");
        name.add("Alex");
        name.add("Zigmund");
        System.out.println(name);
    }
}
