package ru.job4j.collection;

import java.util.Comparator;

/**
 * 4. Сортировка номера.[#242842]
 */
public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftNum = Integer.valueOf(left.substring(0, left.indexOf('.')));
        int rightNum = Integer.valueOf(right.substring(0, right.indexOf('.')));
        return Integer.compare(leftNum, rightNum);
    }
}
