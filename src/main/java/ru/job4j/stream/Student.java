package ru.job4j.stream;

import java.util.Objects;

/**
 * 3. Jdk 1.9, 1.10 Нововведения.
 * 0. Stream API улучшения[#242712]
 * модель данных Student fio, score
 *
 * @author D.Stepanov
 * @since 4.05.2020
 */
public class Student {
    private String fio;
    private int score;

    public Student() {
    }

    public Student(String fio, int score) {
        this.fio = fio;
        this.score = score;
    }

    public String getFio() {
        return fio;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(fio, student.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, score);
    }
}
