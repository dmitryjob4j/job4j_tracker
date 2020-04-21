package ru.job4j.tracker;

import org.junit.Test;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class SortByNameItemTest {
    @Test
    public void sortByName() {
        List<Item> items = Arrays.asList(
                new Item("B"),
                new Item("C"),
                new Item("F"),
                new Item("A"),
                new Item("D")
        );
        Collections.sort(items, new SortByNameItem());
        List<Item> expected = Arrays.asList(
                new Item("A"),
                new Item("B"),
                new Item("C"),
                new Item("D"),
                new Item("F")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void sortByNameReverse() {
        List<Item> items = Arrays.asList(
                new Item("B"),
                new Item("C"),
                new Item("F"),
                new Item("A"),
                new Item("D")
        );
        Collections.sort(items, new SortByNameItemReversed());
        List<Item> expected = Arrays.asList(
                new Item("F"),
                new Item("D"),
                new Item("C"),
                new Item("B"),
                new Item("A")
        );
        assertThat(items, is(expected));
    }

}
