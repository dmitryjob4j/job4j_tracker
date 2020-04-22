package ru.job4j.collection;

import java.util.Comparator;

/**
 * 4. Сортировка номера.[#242842]
 * @version 2
 */
public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftNum = left.split(". ", 2);
        String[] rightNum = right.split(". ", 2);
        return Integer.compare(Integer.valueOf(leftNum[0]), Integer.valueOf(rightNum[0]));
    }
}
