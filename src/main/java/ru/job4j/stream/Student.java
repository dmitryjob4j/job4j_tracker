package ru.job4j.stream;

import java.util.Objects;

/**
 * 2. Stream API
 * 1. Фильтрация учеников.[#242706]
 * модель данных Student
 *
 * @author D.Stepanov
 * @since 2.05.2020
 */
public class Student {
    private int score;

    public Student(int score) {
        this.score = score;
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
        return score == student.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }
}
