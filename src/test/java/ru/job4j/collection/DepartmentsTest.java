package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * 3. Jdk 1.9, 1.10 Нововведения.
 * 1. Collection API Улучшения[#242713]
 * Отсортировать департаменты[#242838]
 * Тест на добовление недостоющих элементов и прямую сортировку.
 *
 * @author D.Stepanov
 * @version 1
 * @since 05.05.2020
 */
public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/ks1/kss2");
        List<String> expect = List.of(
                "k1",
                "k1/ks1",
                "k1/ks1/kss2"
        );
        List<String> result = Departments.fillGraps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1",
                "k1/sk1",
                "k2/sk2/ssk3"
        );
        List<String> expect = List.of(
                "k1",
                "k1/sk1",
                "k2",
                "k2/sk2",
                "k2/sk2/ssk3"
        );
        List<String> result = Departments.fillGraps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }
}
