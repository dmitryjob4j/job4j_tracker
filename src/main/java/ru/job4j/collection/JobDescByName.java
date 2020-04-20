package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2. Комбинированный компаратор.[#242844]
 * задание.
 * JobDescByName поле name по убыванию
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
