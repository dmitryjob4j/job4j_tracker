package ru.job4j.tracker.encapsulation;

/**
 * 0. Что такое инкапсуляция.[#242938]
 */
public class Config {
    private String name; //1
    private int position; //2
    private String[] properties; //3

    public Config(String name) {
        this.name = name;
    }

    public void print() { //4
        System.out.println(position);
    }

    public String getPropety(String key) { //5
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
