package ru.job4j.collection;

/**
 * 2. Комбинированный компаратор.[#242844]
 * задание.
 * модель данных Job
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + "name='" + name + '\'' + ", priority=" + priority + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}
