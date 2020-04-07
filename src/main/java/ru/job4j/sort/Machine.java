package ru.job4j.sort;

import java.util.Arrays;

/**
 * Сдача в кофе машине.[#34741]
 *
 * @author Dmirty Stepanov[#242692]
 * @version 1
 * @since 07.04.2020
 */

public class Machine {
    /**
     * обевление массива разменных монет
     */
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
        for (int i = 0; i < coins.length && money != 0; i++) {
            while (money - coins[i] >= 0) {
                money -= coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
