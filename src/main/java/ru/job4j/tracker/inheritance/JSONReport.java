package ru.job4j.tracker.inheritance;

/**
 * 4. Переопределение[#242926]
 */
public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() +
                " name : " + name + "," + System.lineSeparator() +
                " body : " + body + System.lineSeparator() +
                "}";
    }
}
