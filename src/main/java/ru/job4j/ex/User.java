package ru.job4j.ex;

/**
 * 0.5. Иерархия исключений и множественный catch.[#242903]
 * Задание.
 * Конструктор
 *
 * @since 05.04.2020
 */
public class User {
    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
