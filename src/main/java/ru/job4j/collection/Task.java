package ru.job4j.collection;

/**
 * 1. Уникальные задачи.[#242860]
 * Задача
 * Клас модель Task
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 17.04.2020
 */
public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
