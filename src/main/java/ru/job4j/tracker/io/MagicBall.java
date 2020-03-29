package ru.job4j.tracker.io;

import java.util.Scanner;
import java.util.Random;

/**
 * 1. Чтение из консоли. Класс Scanner.[#242881]
 * Задание
 * @since 30.03.2020
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ->");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.print("Да. Мой господин");
        } else if (answer == 1) {
            System.out.print("Нет. Мой госпадин");
        } else {
            System.out.print("Может бать. Мой госпадин");
        }


    }
}
