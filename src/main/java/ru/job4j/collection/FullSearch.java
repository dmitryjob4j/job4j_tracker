package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * 1. Уникальные задачи.[#242860]
 * Задача
 * Клаcc FullSearch метод extractNumber убирает все дубликаты из массива данных
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 17.04.2020
 */
public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
