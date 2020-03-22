package ru.job4j.tracker.inheritance;

/**
 * 2. Перегрузка конструктора.[#242925]
 * Задача
 * class Animal наследник Predator
 *
 * @version 2
 * @since 22.03.2020
 */
public class Animal {
    private String name;

    public Animal() {
        super();
        System.out.println("Animal");
    }

    public Animal(String ani) {
        this.name = ani;
    }

/*    public static void main(String[] args) {
        String ti = "Tiger";
        Tiger tiger = new Tiger(ti);
    }*/
}

