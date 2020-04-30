package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 1. Labmda /
 * 5. Подсчет функции в диапазоне.[#242697]
 * реализация метода diapason
 */
public class FunctionDiapason {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> tmp = new ArrayList<Double>();
        for (int i = start; i < end; i++) {
            Double x = (double) i;
            tmp.add(func.apply(x));
        }
        return new ArrayList<>(tmp);
    }
}
