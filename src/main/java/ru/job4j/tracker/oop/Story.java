package ru.job4j.tracker.oop;

/**
 * 1.6. Взаимодействие объектов.[#242917] Пример
 * Петя серый волк и красная шапочка
 *
 * @since 20.03.2020
 */
public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();

        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
