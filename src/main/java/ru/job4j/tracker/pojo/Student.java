package ru.job4j.tracker.pojo;

import java.util.Date;

/**
 * 2. Модель данных.[#242931]
 * задание
 *
 * @since 24.03.2020
 */
public class Student {
    private String fio;
    private String group;
    private String enrolled;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(String enrolled) {
        this.enrolled = enrolled;
    }
}
