package ru.job4j.stragery;

import java.util.StringJoiner;

/**
 * 7. Шаблон проектирования - Стратегия.[#242894]
 *
 * @author DStepanov
 * @version 1
 * @since 02.04.2020
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("+");
        pic.add("+ +");
        pic.add("+  +");
        pic.add("+++++");
        pic.add(System.lineSeparator());
        return pic.toString();
    }
}
