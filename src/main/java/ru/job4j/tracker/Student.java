package ru.job4j.tracker;

/**
 * 1.2. Вызов метода объекта[#242915]
 * Задание создать метод song(), и вызвать его обьектом petya три раза.
 *
 * @author dstepanov haoos@inbox.ru
 * @since 19.03.2020
 */

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.song();
        petya.music();
        petya.song();
        petya.music();
        petya.song();
    }
}
