package ru.job4j.ex;

/**
 * 0.4. Пользовательские исключения.[#242902]
 * премер. Обьявление исключение в сигнатуре метода.
 * Конструкция try-catch.
 *
 * @since 05.04.2020
 */
public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
        //load jdbc
    }
/*
    public static void main(String[] args) throws UserInputException {
        load("jdbc://localhost:8080");
    }*/

    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
