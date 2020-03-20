package ru.job4j.tracker.oop;

/**
 * 1.6. Взаимодействие объектов.[#242917]
 * Задача
 * колобок
 *
 * @since 20.03.2020
 */
public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
