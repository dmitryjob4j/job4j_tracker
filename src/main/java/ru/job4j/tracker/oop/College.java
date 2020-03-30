package ru.job4j.tracker.oop;

/**
 * 3.1. Приведение типов. Повышение типа и понижение типа.[#242886]
 * задание
 *
 * @since 30.03.2020
 */
public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        StudentT studentT = freshman;
        Object object = freshman;
    }
}
