package ru.job4j.collection;

import java.util.Comparator;

/**
 * 3. Компаратор для строк.[#242841]
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int l = left.length();
        int r = right.length();
        int index = 0;
        int sizeRsl = Integer.compare(l, r);
        int n = sizeRsl <= 0 ? l : r;
        while (index < n) {
            char chL = left.charAt(index);
            char chR = right.charAt(index);
            if (chL != chR) {
                sizeRsl = Character.compare(chL, chR);
                break;
            } else if (index == n - 1 && l == r) {
                sizeRsl = Character.compare(chL, chR);
                break;
            } else if ((index == n - 1) && (sizeRsl > 0 || sizeRsl < 0)) {
                sizeRsl = Integer.compare(l, r);
                break;
            } else {
                index++;
            }
        }
        return sizeRsl;
    }
}
