package ru.job4j.ex;

/**
 * 0.5. Иерархия исключений и множественный catch.[#242903]
 * Задание.
 *
 * @since 05.04.2020
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
