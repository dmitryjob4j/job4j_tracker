package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 5. Конвертация листа массивов в один лист Integer[#242851]
 * Задание. Тест.
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 15.04.2020
 */
public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1});
        in.add(new int[]{2, 3});
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }
}
