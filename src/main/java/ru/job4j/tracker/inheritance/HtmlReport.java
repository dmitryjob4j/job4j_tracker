package ru.job4j.tracker.inheritance;

/**
 * 4. Переопределение[#242926]
 */
public class HtmlReport extends TextReport {
    public String generate(String name, String body) {
        return "<h1>" + name + "<h1/>" +
                "<br/>" +
                "<span>" + body + "</span>";
    }
}
