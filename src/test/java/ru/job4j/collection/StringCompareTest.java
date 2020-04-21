package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * 3. Компаратор для строк.[#242841]
 * тест.
 */
public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShoulBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRinghtShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void secondSmallNegativ() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Petrov",
                "petrov"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenLeftLiteLessThanRightResultShoulBePositiv() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Pew",
                "Petrov"
        );
        assertThat(rsl, greaterThan(0));
    }
}
