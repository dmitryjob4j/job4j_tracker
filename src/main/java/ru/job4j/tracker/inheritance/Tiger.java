package ru.job4j.tracker.inheritance;

/**
 * 1. Конструктор по умолчанию.[#242924]
 * Задача
 * class Tiger родтель Predator.
 *
 * @since 22.03.2020
 */
public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    public Tiger(String name) {
        super(name);
    }
}
