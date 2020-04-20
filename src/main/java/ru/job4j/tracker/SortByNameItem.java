package ru.job4j.tracker;

import java.util.Comparator;

/**
 * 0. Сортировка[#242845]
 * задание. Comparator сортировки по возростанию.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class SortByNameItem implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
