package ru.job4j.stream;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

/**
 * 2. Stream API
 * 1. Фильтрация учеников.[#242706]
 * класс сортировки student
 *
 * @author D.Stepanov
 * @since 2.05.2020
 */
public class School {
    /**
     * @param students
     * @param predict
     * @return
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> result = students.stream().filter(
                student -> predict.test(student)
        ).collect(Collectors.toList());
        return result;
    }
}
