package ru.job4j.tracker.inheritance;

/**
 * 4. Переопределение[#242926]
 */
public class ReportUsage {
    public static void main(String[] args) {
        TextReport textReport = new TextReport();
        String text = textReport.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport htmlReport = new HtmlReport();
        text = htmlReport.generate("Report's name", "Report's body");
        System.out.println(text);
        JSONReport jsonReport = new JSONReport();
        text = jsonReport.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
