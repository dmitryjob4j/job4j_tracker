package ru.job4j.stream;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

/**
 * 2. Stream API
 * 5. Преобразование матрицы чисел в список чисел.[#242710]
 * задание двумерный массив Integer преобразовать в List
 * тесты
 *
 * @author D.Stepanov
 * @since 3.05.2020
 */
public class MatrixTest {
    @Test
    public void integerMatrix3X3toList() {
        Integer[][] input = new Integer[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Matrix matrix = new Matrix();
        List<Integer> result = matrix.matrixToList(input);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(result, is(expect));
    }

    @Test
    public void intrgerMatrix2X2toList() {
        Integer[][] input = new Integer[][]{
                {4, 3},
                {2, 1}
        };
        Matrix matrix = new Matrix();
        List<Integer> result = matrix.matrixToList(input);
        List<Integer> expect = List.of(4, 3, 2, 1);
        assertThat(result, is(expect));
    }
}
