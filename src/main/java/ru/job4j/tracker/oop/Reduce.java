package ru.job4j.tracker.oop;

/**
 * 5.1. Зона видимости переменных.[#242920]
 * исправлено имя области поля arrayPo
 */
public class Reduce {
    private int[] arrayPo;

    public void to(int[] array) {
        arrayPo = array;
    }

    public void print() {
        for (int i = 0; i < arrayPo.length; i++) {
            System.out.print(arrayPo[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
