package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 2. Очередь с приоритетом на LinkedList[#242848]
 * задача
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 14.04.2020
 */
public class PriorityQueueTest {
    @Test
    public void wenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("not", 7));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}
