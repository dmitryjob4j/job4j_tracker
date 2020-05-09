package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Часть 004. FP, Lambda, Stream API.
 * Группировка по интересам. [#106993].
 * Вопросы к разделу тестовое задание.
 * класc Group.
 *
 * @author D.Stepanov
 * @version 1
 * @since 09.05.2020
 */
public class Group {
    /**
     *
     * @param students метод групирует коллекцию при помощи groupingBy
     * @return
     */
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(s -> s.getUnits().stream()
                .map(u -> new Holder(u, s.getName()))
        ).collect(
                Collectors.groupingBy(t -> t.key,
                        Collector.of(
                                HashSet::new,
                                (set, el) -> set.add(el.value),
                                (left, right) -> {
                                    left.addAll(right);
                                    return left;
                                }
                        )
                )
        );
    }
}