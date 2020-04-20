package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2. Комбинированный компаратор.[#242844]
 * задание.
 * JobDescByPriority поле priority по убыванию
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
