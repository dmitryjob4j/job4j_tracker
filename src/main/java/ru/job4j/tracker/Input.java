package ru.job4j.tracker;

/**
 * 3. Интерфейс Input[#242883]
 * пример
 *
 * @since 30.03.2020
 */
public interface Input {
    String askStr(String question);

    int askInt(String question);
}
