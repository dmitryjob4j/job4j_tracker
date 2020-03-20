package ru.job4j.tracker.oop;

/**
 * 1.4. Вызов метод с возвращаемым типом.[#242918] Задача.
 * создать класс DummyDic и метод engToRus,
 * метод должен вернуть строчку "Неизвестное слово" + eng"
 *
 * @author dstepanov
 * @since 20.03.2020
 */
public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово. " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic engWord = new DummyDic();
        String noWord = engWord.engToRus("fsdfere");
        System.out.println(noWord);

    }
}
