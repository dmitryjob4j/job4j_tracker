package ru.job4j.ex;

/**
 * 0.4. Пользовательские исключения.[#242902]
 * задание
 *
 * @since 05.04.2020
 */
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
