package ru.job4j.collection;

import java.util.List;

/**
 * 3. Конвертация ArrayList в двухмерный массив[#242850]
 * Задание
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 14.04.2020
 */
public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            if (cell < cells - 1) {
                cell++;
            } else if (row < groups - 1) {
                cell = 0;
                row++;
            }
        }
        return array;
    }

   /* public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }*/
}
