package ru.job4j.ex;

/**
 * 0.6. Error - исключения, связанные с работой виртуальной машины[#242904]
 * Задание.
 *
 * @since 05.04.2020
 */
public class FactRec {
    public static int calc(int n) {
        int fact = 0;
        if (n == 0 || n == 1) {
            fact = 1;
        } else {
            fact = calc(n - 1) * n;
        }
        return fact;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
