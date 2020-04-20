package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 0. Сортировка[#242845]
 * пример 1 int sort, compareTo, Collection.reverseOrder()
 *
 */
public class ListSort {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(listInt);
        Collections.sort(listInt);
        System.out.println(listInt);
        Collections.sort(listInt, Collections.reverseOrder());
        System.out.println(listInt);
        List<String> list = Arrays.asList("d", "f", "b", "a", "c");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Integer first = 1;
        Integer second = 5;
        int rsl = first.compareTo(second);
        System.out.println(rsl);
        String petr = "Petr";
        String ivan = "Ivan";
        int rslStr = petr.compareTo(ivan);
        System.out.println(rslStr);
    }
}
