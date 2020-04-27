package ru.job4j.lambda;

/**
 * Часть 004. 1. Lambda
 * 1. Анонимные классы[#242702]
 * Модель данных Attachment
 *
 * @author D.Stepanov
 * @version 1
 * @since 27.04.2020
 */
public class Attachment {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Attachment{" + "name='" + name + '\'' + ", size=" + size + '}';
    }
}
