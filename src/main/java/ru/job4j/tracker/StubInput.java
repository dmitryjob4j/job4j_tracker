package ru.job4j.tracker;

/**
 * 3. Интерфейс Input[#242883]
 * пример
 *
 * @since 30.03.2020
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers){
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}
