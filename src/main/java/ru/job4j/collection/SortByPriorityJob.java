package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2. Комбинированный компаратор.[#242844]
 * задание.
 * SortByPriorityJob поле Priority по возростанию
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class SortByPriorityJob implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
