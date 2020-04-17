package ru.job4j.collection;

import java.util.HashSet;

/**
 * 2. Идентичные тексты.[#242861]
 * Задача
 * Клаcc UniqueText метод isEquals сравнивает два текста если они одинаковы то true если нет то false.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 17.04.2020
 */
public class UniqueText {
    public static boolean isEquals(String originText, String dublicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = dublicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String word : origin) {
            check.add(word);
        }
        for (String word : text) {
            if (!check.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
