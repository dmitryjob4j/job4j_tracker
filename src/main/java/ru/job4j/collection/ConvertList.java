package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Конвертация листа массивов в один лист Integer[#242851]
 * Задание
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 15.04.2020
 */
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rsl.add(cell);
            }
        }
        return rsl;
    }
}
