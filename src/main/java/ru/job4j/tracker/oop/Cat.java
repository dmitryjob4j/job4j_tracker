package ru.job4j.tracker.oop;

/**
 * 1.4. Вызов метод с возвращаемым типом.[#242918] пример
 *
 * @since 20.03.2020
 */

public class Cat {
    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}
