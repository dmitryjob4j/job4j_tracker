package ru.job4j.ex;

/**
 * 0.4. Пользовательские исключения.[#242902]
 * премер. наследник UserInputException
 *
 * @since 05.04.2020
 */
public class UserInputException extends Exception {
    public UserInputException(String message) {
        super(message);
    }
}
