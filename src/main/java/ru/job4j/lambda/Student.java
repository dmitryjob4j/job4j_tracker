package ru.job4j.lambda;

import java.util.Set;

/**
 * Часть 004. FP, Lambda, Stream API.
 * Группировка по интересам. [#106993].
 * Вопросы к разделу тестовое задание.
 * модель данных Student.
 *
 * @author D.Stepanov
 * @version 1
 * @since 09.05.2020
 */
public class Student {
    private String name;
    private Set<String> units;

    public Student(String name, Set<String> units) {
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public Set<String> getUnits() {
        return units;
    }
}
