package ru.job4j.stream;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

/**
 * 2. Stream API
 * 4. Преобразование List в Map. [#242709]
 * класс сортировки student
 *
 * @author D.Stepanov
 * @since 3.05.2020
 */
public class School {
    /**
     * мотод сортирует студентов по количеству баллов
     *
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

    /**
     * метод преобразовывает список студентов в карту Map
     *
     * @param students
     * @return
     */
    public Map<String, Student> toMap(List<Student> students) {
        Map<String, Student> result = students.stream()
                .collect(
                        Collectors.toMap(
                                student -> student.getFio(),
                                student -> student
                        )
                );
        return result;
    }
}
