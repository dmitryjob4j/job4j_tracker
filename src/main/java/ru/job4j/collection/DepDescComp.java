package ru.job4j.collection;

import java.util.Comparator;

/**
 * Отсортировать департаменты[#242838]
 * Comparatoк для сложной сортировки Departaments.
 *
 * @author D.Stepanov
 * @version 1
 * @since 26.04.2020
 */
public class DepDescComp implements Comparator<String> {

    @Override
    /**
     * реализация сложной сортировки.
     * Главные элементы сортируются по убыванию, внутренние по возростанию.
     */
    public int compare(String dep1, String dep2) {
        String[] deps1 = dep1.split("/", 2);
        String[] deps2 = dep2.split("/", 2);
        int res = 0;
        if (deps1[0].equals(deps2[0])) {
            res = dep1.compareTo(dep2);
        } else {
            res = dep2.compareTo(dep1);
        }
        return res;
    }
}
