package ru.job4j.tracker.inheritance;

/**
 * 1. Конструктор по умолчанию.[#242924]
 * Задача
 * class Animal наследник Predator
 *
 * @since 22.03.2020
 */
public class Animal {
    public Animal() {
        super();
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}

