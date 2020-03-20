package ru.job4j.tracker.oop;

/**
 * 1.7. Состояние объекта.[#242919] пример
 * переливаем воду из двух сасудов
 *
 * @since 20.03.2020
 */
public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) {
        this.value = (this.value + another.value)/2;
        another.value = value;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}
