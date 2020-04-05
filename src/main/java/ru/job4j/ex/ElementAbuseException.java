package ru.job4j.ex;

/**
 * 0.5. Иерархия исключений и множественный catch.[#242903]
 * пример
 *
 * @since 05.04.2020
 */
public class ElementAbuseException extends Exception {
    public ElementAbuseException(String message) {
        super(message);
    }
}
