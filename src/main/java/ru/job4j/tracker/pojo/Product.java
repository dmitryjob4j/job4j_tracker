package ru.job4j.tracker.pojo;

/**
 * 3. Массивы и модели.[#242932]
 * пример
 *
 * @since 24.03.2020
 */
public class Product {
    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
