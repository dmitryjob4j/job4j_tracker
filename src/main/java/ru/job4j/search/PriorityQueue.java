package ru.job4j.search;

import java.util.LinkedList;

/**
 * 2. Очередь с приоритетом на LinkedList[#242848]
 * задача
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 14.04.2020
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
