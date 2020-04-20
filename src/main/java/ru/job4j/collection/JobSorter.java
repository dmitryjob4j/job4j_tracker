package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 0. Сортировка[#242845]
 * пример
 * сортировка модели данных Comparable
 */
public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("AFix bugs", 4),
                new Job("CImpl task", 2),
                new Job("BReboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob().reversed());
        System.out.println(jobs);
    }
}
