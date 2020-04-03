package ru.job4j.tracker;

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
        Item[] item = tracker.findByName(input.askStr("Enter NAME find Item:->"));
        System.out.println("find Name:");
        for (int i = 0; i < item.length; i++) {
            System.out.println("ID: " + item[i].getId() + " Nsme: " + item[i].getName());
        }
        return true;
    }
}
