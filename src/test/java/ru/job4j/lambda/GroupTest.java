package ru.job4j.lambda;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.*;
/**
 * Часть 004. FP, Lambda, Stream API.
 * Группировка по интересам. [#106993].
 * Вопросы к разделу тестовое задание.
 * Тест.
 *
 * @author D.Stepanov
 * @version 1
 * @since 09.05.2020
 */
public class GroupTest {
    @Test
    public void groupByStudentSection() {
        Set<String> javaHatmlSql = new HashSet<>();
        javaHatmlSql.add("java");
        javaHatmlSql.add("html");
        javaHatmlSql.add("sql");
        Set<String> htmlJava = new HashSet<>();
        htmlJava.add("html");
        htmlJava.add("java");
        Set<String> sqlHtml = new HashSet<>();
        sqlHtml.add("sql");
        sqlHtml.add("html");
        Set<String> javaName = new HashSet<>();
        javaName.add("Stepanov");
        javaName.add("Petrov");
        Set<String> htmlName = new HashSet<>();
        htmlName.add("Stepanov");
        htmlName.add("Petrov");
        htmlName.add("Belov");
        Set<String> sqlName = new HashSet<>();
        sqlName.add("Stepanov");
        sqlName.add("Belov");
        List<Student> input = Arrays.asList(
                new Student("Stepanov", javaHatmlSql),
                new Student("Petrov", htmlJava),
                new Student("Belov", sqlHtml));
        Map<String, Set<String>> result = Group.sections(input);
        Map<String, Set<String>> expect = new HashMap<>();
        expect.put("java", javaName);
        expect.put("html", htmlName);
        expect.put("sql", sqlName);
        assertThat(result, is(expect));
    }
}
