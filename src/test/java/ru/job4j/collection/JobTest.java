package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

/**
 * 2. Комбинированный компаратор.[#242844]
 * тест
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 20.04.2020
 */
public class JobTest {
    /**
     * По убыванию Name and Priority
     */
    @Test
    public void whenComparatorByNameAndPriorityRevers() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    /**
     * по возрастанию по Name.
     */
    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpName = new SortByNameJob();
        int rsl = cmpName.compare(
                new Job("Abc", 7),
                new Job("Dfg", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    /**
     * по возрастанию Priority
     */
    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> cmpPrioryty = new SortByPriorityJob();
        int rsl = cmpPrioryty.compare(
                new Job("Dfg", 3),
                new Job("Abc", 6)
        );
        assertThat(rsl, lessThan(0));
    }

    /**
     * По убыванию Name
     */
    @Test
    public void whenComparatorByNameRevers() {
        Comparator<Job> cmpNameRev = new JobDescByName();
        int rsl = cmpNameRev.compare(
                new Job("Abc", 7),
                new Job("Dfg", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    /**
     * По убыванию Priority
     */
    @Test
    public void whenComparatorByPriorityRevers() {
        Comparator<Job> cmpPriorityRev = new JobDescByPriority();
        int rsl = cmpPriorityRev.compare(
                new Job("Dfg", 3),
                new Job("Abc", 6)
        );
        assertThat(rsl, greaterThan(0));
    }

    /**
     * По возрастанию Name and Priority
     */
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriorRev = new SortByNameJob().thenComparing(new SortByPriorityJob());
        int rsl = cmpNamePriorRev.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}


