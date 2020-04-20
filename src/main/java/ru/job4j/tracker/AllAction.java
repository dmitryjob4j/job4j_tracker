package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class AllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
      /*  List<Item> allItem = new ArrayList<>();
        allItem = tracker.findAll();*/
        for (Item item : tracker.findAll()) {
            System.out.println("ID: " + item.getId() + " Name: " + item.getName() + ".");
        }
        return true;
    }
}
