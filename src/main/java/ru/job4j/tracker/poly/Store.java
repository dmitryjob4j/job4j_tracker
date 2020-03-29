package ru.job4j.tracker.poly;

public interface Store {
    void save(String value);

    String[] load();
}
