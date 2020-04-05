package ru.job4j.ex;

/**
 * 0.3. Тестирование исключений с junit[#242901]
 * пример
 *
 * @since 05.04.2020
 */
public class Count {
    public static int add(int start, int finsh) {
        if (start > finsh) {
            throw new IllegalArgumentException("Start should be less then finish");
        }
        int rsl = 0;
        for (int i = start; i != finsh; i++) {
            rsl += i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is: " + add(10, 2));
    }
}
