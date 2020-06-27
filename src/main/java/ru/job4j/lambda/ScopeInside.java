package ru.job4j.lambda;

import java.util.function.Supplier;

/**
 * 1. Уровень - Стажер.Часть 004.FP, Lambda, Stream API.1.Labmda
 * 4. Зона видимости в лямбда и исключения [#242701]
 *
 * @since 27.06.2020
 */
public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int num = i;
            total += add(
                    () -> number[num]
            );
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
