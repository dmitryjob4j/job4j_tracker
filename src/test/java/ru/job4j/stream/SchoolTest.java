package ru.job4j.stream;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 3. Jdk 1.9, 1.10 Нововведения.
 * 0. Stream API улучшения[#242712]
 * тесты
 *
 * @author D.Stepanov
 * @version 2
 * @since 4.05.2020
 */
public class SchoolTest {
    @Test
    public void listOfStudentScoreOfBoundAndNullElement() {
        List<Student> input = Arrays.asList(
                new Student("Stepanov", 10),
                new Student("Stepanov", 55),
                null,
                new Student("Arsentev", 100),
                null,
                new Student("Arsentev", 50)
        );

        School school = new School();
        List<Student> result = school.levelOf(input, 50);
        List<Student> expect = List.of(
                new Student("Arsentev", 100),
                new Student("Stepanov", 55)
        );
        assertThat(result, is(expect));
    }

    @Test
    public void listStudentToMapFioStudent() {
        List<Student> input = List.of(
                new Student("Stepanov", 10),
                new Student("Stepanov", 20),
                new Student("Arsentev", 100),
                new Student("Arsentev", 50)
        );
        School school = new School();
        Map<String, Student> result = school.toMap(input);
        Map<String, Student> expect = Map.of(
                "Stepanov", new Student("Stepanov", 20),
                "Arsentev", new Student("Arsentev", 100)
        );
        assertThat(result, is(expect));
    }

    @Test
    public void when0and50ball10V() {
        School school = new School();
        List<Student> input = List.of(
                new Student(null, 100),
                new Student(null, 10),
                new Student(null, 80),
                new Student(null, 70),
                new Student(null, 50),
                new Student(null, 30),
                new Student(null, 55),
                new Student(null, 60),
                new Student(null, 75)
        );
        List<Student> resuslt = school.collect(input, student -> student.getScore() <= 50);
        List<Student> expect = List.of(
                new Student(null, 10),
                new Student(null, 50),
                new Student(null, 30)
        );
        assertThat(resuslt, is(expect));
    }

    @Test
    public void when51and70ball10B() {
        School school = new School();
        List<Student> input = List.of(
                new Student(null, 100),
                new Student(null, 10),
                new Student(null, 80),
                new Student(null, 70),
                new Student(null, 50),
                new Student(null, 30),
                new Student(null, 55),
                new Student(null, 60),
                new Student(null, 75)
        );
        List<Student> result = school.collect(input, student -> student.getScore() > 50 && student.getScore() <= 70);
        List<Student> expect = List.of(
                new Student(null, 70),
                new Student(null, 55),
                new Student(null, 60)
        );
        assertThat(result, is(expect));
    }

    @Test
    public void when71to100ball10A() {
        School school = new School();
        List<Student> input = List.of(
                new Student(null, 100),
                new Student(null, 10),
                new Student(null, 80),
                new Student(null, 70),
                new Student(null, 50),
                new Student(null, 30),
                new Student(null, 55),
                new Student(null, 60),
                new Student(null, 75)
        );
        List<Student> result = school.collect(input, student -> student.getScore() > 70);
        List<Student> expect = List.of(
                new Student(null, 100),
                new Student(null, 80),
                new Student(null, 75)
        );
        assertThat(result, is(expect));
    }
}
