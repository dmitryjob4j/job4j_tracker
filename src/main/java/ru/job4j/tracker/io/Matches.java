package ru.job4j.tracker.io;

import java.util.Scanner;

/**
 * 2. Scanner и чтение числа из консоли.[#242882]
 * задача "Сделать игру 11 спичек."
 * @version 2
 * @since 30.03.2020
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int match = 11;
        int gamer = 1;
        int gamerNum = 11;
        int select = 0;
        System.out.println("+++Доброй пожаловать в игру 11 спичек.+++" + System.lineSeparator() +
                "+++Условия игры: Играют двое Господ.+++" + System.lineSeparator() +
                "+++Каждый Господин может брать от 1-й до 3-х спичек+++" + System.lineSeparator() + "+++Начинаем+++");
        while (match > 0) {
            System.out.print("Господин №" + gamer + " берет спички -> ");
            select = Integer.valueOf(input.nextLine());
            if (select <= 3 && select > 0) {
                match -= select;
                if (match <= 0) {
                    System.out.print("Господин №" + gamer + " выиграл игру!" + System.lineSeparator() + "Игра окончена");
                    break;
                } else {
                    gamerNum--;
                    gamer = (gamerNum % 2 != 0) ? 1 : 2;
                    System.out.println("Осталось " + match + " спичек");
                }
            } else {
                System.out.println("Господин №" + gamer + " взял неверное количиство спичек!");
            }
        }
    }
}
