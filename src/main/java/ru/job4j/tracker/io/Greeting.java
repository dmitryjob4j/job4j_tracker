package ru.job4j.tracker.io;

import java.util.Scanner;

/**
 * 1. Чтение из консоли. Класс Scanner.[#242881]
 * пример
 *
 * @since 30.03.2020
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.print("Добро пожаловать. Как Вас зовут? ");
        String name = imput.nextLine();
        System.out.println(name + ", рад Вас видеть!");
    }
}