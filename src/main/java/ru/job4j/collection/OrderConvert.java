package ru.job4j.collection;

import ru.job4j.tracker.oop.Object;

import java.util.HashMap;
import java.util.List;

/**
 * 2. Преобразования List в Map.[#242858]
 * Задача
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 18.04.2020
 */
public class OrderConvert {
    /**
     * process конвертирует List в Map.
     *
     * @param orders
     * @return
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order oreder : orders) {
            map.put(oreder.getNumber(), oreder);
        }
        return map;
    }
}
