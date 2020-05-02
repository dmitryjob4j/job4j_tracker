package ru.job4j.stream;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;
/**
 * 2. Stream API
 * 1. Фильтрация учеников.[#242706]
 * тесты
 *
 * @author D.Stepanov
 * @since 2.05.2020
 */
public class SchoolTest {
    @Test
    public void when0and50ball10V() {
        School school = new School();
        List<Student> input = List.of(
                new Student(100),
                new Student(10),
                new Student(80),
                new Student(70),
                new Student(50),
                new Student(30),
                new Student(55),
                new Student(60),
                new Student(75)
        );
        List<Student> resuslt = school.collect(input, student -> student.getScore() <= 50);
        List<Student> expect = List.of(
                new Student(10),
                new Student(50),
                new Student(30)
        );
        assertThat(resuslt, is(expect));
    }

    @Test
    public void when51and70ball10B() {
        School school = new School();
        List<Student> input = List.of(
                new Student(100),
                new Student(10),
                new Student(80),
                new Student(70),
                new Student(50),
                new Student(30),
                new Student(55),
                new Student(60),
                new Student(75)
        );
        List<Student> result = school.collect(input, student -> student.getScore() > 50 && student.getScore() <= 70);
        List<Student> expect = List.of(
                new Student(70),
                new Student(55),
                new Student(60)
        );
        assertThat(result, is(expect));
    }

    @Test
    public void when71to100ball10A() {
        School school = new School();
        List<Student> input = List.of(
                new Student(100),
                new Student(10),
                new Student(80),
                new Student(70),
                new Student(50),
                new Student(30),
                new Student(55),
                new Student(60),
                new Student(75)
        );
        List<Student> result = school.collect(input, student -> student.getScore() > 70);
        List<Student> expect = List.of(
                new Student(100),
                new Student(80),
                new Student(75)
        );
        assertThat(result, is(expect));
    }
}
