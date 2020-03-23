package ru.job4j.tracker.inheritance;

/**
 * 5. Аннотация @Override[#242927]
 */
public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() +
                " name : " + name + "," + System.lineSeparator() +
                " body : " + body + System.lineSeparator() +
                "}";
    }
}
