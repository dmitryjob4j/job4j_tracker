package ru.job4j.tracker;

/**
 * 3. Интерфейс Input[#242883]
 * пример
 *
 * @since 30.03.2020
 */
public class StubInput implements Input {
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
