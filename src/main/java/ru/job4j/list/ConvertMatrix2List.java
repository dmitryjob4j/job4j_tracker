package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Конвертация двумерного массива в ArrayList[#242849]
 * Задание
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 15.04.2020
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
