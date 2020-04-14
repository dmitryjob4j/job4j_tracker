package ru.job4j.search;

/**
 * 2. Очередь с приоритетом на LinkedList[#242848]
 * задача
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 14.04.2020
 */
public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
