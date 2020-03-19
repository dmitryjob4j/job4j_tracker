package ru.job4j.tracker.oop;

/**
 * 1.3. Вызов метода с аргументами.[#242916]
 * задача создать класс Jukebox и метод с параметрами music
 * через обьект класса вызвать метод.
 *
 * @author dstepanov
 * @since 19.03.2020
 */
public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(2);
        song.music(1);
        song.music(10);
    }
}
