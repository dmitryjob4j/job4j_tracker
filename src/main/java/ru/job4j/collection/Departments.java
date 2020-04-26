package ru.job4j.collection;

import java.util.*;

/**
 * Отсортировать департаменты[#242838]
 *
 * @author D.Stepanov
 * @version 1
 * @since 26.04.2020
 */
public class Departments {
    /**
     * Добовляет пропущеные подразделения.
     *
     * @param deps
     * @return
     */
    public static List<String> fillGraps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String dep : deps) {
            String start = "";
            for (String el : dep.split("/")) {
                if (start.equals("")) {
                    start += el;
                } else {
                    start += "/" + el;
                }
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * Сортировка natural order
     *
     * @param orgs
     */
    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    /**
     * Обратная сортировка главных аргументов внутренние по возростанию.
     *
     * @param orgs
     */
    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}


