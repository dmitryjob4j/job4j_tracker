package ru.job4j.tracker.inheritance;

/**
 * 1. Конструктор по умолчанию.[#242924]
 * Задача
 * class Predator наследник Tiger, родтель Animal.
 *
 * @since 22.03.2020
 */
public class Predator extends Animal {
    public Predator() {
        super();
        System.out.println("Predator");
    }
}
