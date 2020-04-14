package ru.job4j.collection;

import org.junit.Test;
import org.junit.Ignore;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 3. Конвертация ArrayList в двухмерный массив[#242850]
 * Задание
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 14.04.2020
 */
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
}
