package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * find by name
 */
public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find Item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = new ArrayList<>();
        item = tracker.findByName(input.askStr("Enter NAME find Item:->"));
        System.out.println("find Name:");
        for (Item nameItem : item) {
            System.out.println("ID: " + nameItem.getId() + " Nsme: " + nameItem.getName());
        }
        return true;
    }
}
