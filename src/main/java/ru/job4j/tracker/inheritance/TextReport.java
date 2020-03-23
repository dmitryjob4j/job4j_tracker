package ru.job4j.tracker.inheritance;

/**
 * 4. Переопределение[#242926]
 */
public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
