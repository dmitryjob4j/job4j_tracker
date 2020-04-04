package ru.job4j.ex;

/**
 * 0.2. Кидаем исключение - throw new RuntimeException[#242900]
 * задача
 *
 * @since 04.04.2020
 */
public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println(fact.calc(-5));
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The parameter must not be negative");
        }
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl *= i;
        }
        return rsl;

    }
}
