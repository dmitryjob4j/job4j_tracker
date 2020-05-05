package ru.job4j.search;

import java.util.LinkedList;

/**
 * 3. Jdk 1.9, 1.10 Нововведения.
 * 2. Local-Variable Type Inference[#242714]
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
        var index = 0;
        for (var element : tasks) {
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
