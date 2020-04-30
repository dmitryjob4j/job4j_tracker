package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * 1. Labmda /
 * 5. Подсчет функции в диапазоне.[#242697]
 * тесты
 */
public class FunctionDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionDiapason function = new FunctionDiapason();
        List<Double> result = function.diapason(5, 8, x -> x * 2 + 1);
        List<Double> expect = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSquareFunctionThenLinerResults() {
        FunctionDiapason function = new FunctionDiapason();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(x, 2));
        List<Double> expect = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSignificantFunctionThenlineResults() {
        FunctionDiapason function = new FunctionDiapason();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expect = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expect));
    }
}
