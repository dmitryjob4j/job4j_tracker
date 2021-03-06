package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2. Комбинированный компаратор.[#242844]
 * задание.
 * SortByName поле name по возростанию
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class SortByNameJob implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
