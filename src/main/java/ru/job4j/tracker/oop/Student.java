package ru.job4j.tracker.oop;

/**
 * 1.3. Вызов метода с аргументами.[#242916]
 * пример вызова обьекта с метода с параметром
 *
 * @author dstepanov haoos@inbox.ru
 * @since 19.03.2020
 */

public class Student {
    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
    }
}
