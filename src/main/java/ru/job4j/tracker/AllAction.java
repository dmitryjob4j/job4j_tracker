package ru.job4j.tracker;

public class AllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] allItem = tracker.findAll();
        for (int i = 0; i < allItem.length; i++) {
            System.out.println("ID: " + allItem[i].getId() + " Name: " + allItem[i].getName() + ".");
        }
        return true;
    }
}
