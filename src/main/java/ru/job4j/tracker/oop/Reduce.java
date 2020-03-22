package ru.job4j.tracker.oop;

/**
 * 5.1. Зона видимости переменных.[#242920]
 * переименована переменная метода "to"
 *
 * @version 2
 */
public class Reduce {
    private int[] array;

    public void to(int[] mas) {
        array = mas;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
