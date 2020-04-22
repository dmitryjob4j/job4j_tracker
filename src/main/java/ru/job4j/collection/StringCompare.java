package ru.job4j.collection;

import java.util.Comparator;

/**
 * 3. Компаратор для строк.[#242841]
 * @version 2
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int l = left.length();
        int r = right.length();
        int size = Math.min(l, r);
        int rsl = 0;
        for (int i = 0; i < size; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                rsl = Character.compare(left.charAt(i), right.charAt(i));
                break;
            }
        }
        return rsl == 0 ? Integer.compare(l, r) : rsl;
    }
}
