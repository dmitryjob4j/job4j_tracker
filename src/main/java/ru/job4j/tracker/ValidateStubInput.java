package ru.job4j.tracker;

/**
 * 1.1. Тесты на ValidateInput.[#242905]
 * задание
 *
 * @since 06.04.2020
 */
public class ValidateStubInput extends ValidateInput {
    private String[] data;
    private int position;

    public ValidateStubInput(String[] data) {
        this.data = data;
    }

    @Override
    public String askStr(String question) {
        return data[position++];
    }
}
