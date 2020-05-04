package ru.job4j.stream;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;

/**
 * 3. Jdk 1.9, 1.10 Нововведения.
 * 0. Stream API улучшения[#242712]
 * класс сортировки student
 *
 * @author D.Stepanov
 * @version 1
 * @since 4.05.2020
 */
public class School {
    /**
     * Метод levelOf вернуть список студентов у которых балл аттестата больше bound
     *
     * @param student
     * @param bound
     * @return
     */
    public List<Student> levelOf(List<Student> student, int bound) {
        List<Student> result = student.stream()
                .flatMap(Stream::ofNullable)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .takeWhile(s -> s.getScore() > bound)
                .collect(Collectors.toList());
        return result;
    }

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
                                k -> k.getFio(),
                                v -> v,
                                (k1, k2) -> k1.getScore() > k2.getScore() ? k1 : k2
                        )
                );
        return result;
    }
}
