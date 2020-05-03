package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Stream API
 * 5. Преобразование матрицы чисел в список чисел.[#242710]
 * задание двумерный массив Integer преобразовать в List
 *
 * @author D.Stepanov
 * @since 3.05.2020
 */
public class Matrix {
    /**
     * @param input
     * @return
     */
    public List<Integer> matrixToList(Integer[][] input) {
        List<Integer> result = Arrays.stream(input)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        return result;
    }
}
