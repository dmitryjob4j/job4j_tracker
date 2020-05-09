package ru.job4j.lambda;

import java.util.Objects;

/**
 * Часть 004. FP, Lambda, Stream API.
 * Группировка по интересам. [#106993].
 * Вопросы к разделу тестовое задание.
 * промежутачная модель данных holder для сборки Map<String, Set<String>>.
 *
 * @author D.Stepanov
 * @version 1
 * @since 09.05.2020
 */
public class Holder {
    String key, value;

    public Holder(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Holder holder = (Holder) o;
        return Objects.equals(key, holder.key)
                && Objects.equals(value, holder.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
