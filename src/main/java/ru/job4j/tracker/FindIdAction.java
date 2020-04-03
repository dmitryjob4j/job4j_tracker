package ru.job4j.tracker;

/**
 * find by ID
 */
public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find Item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item findId = tracker.findById(input.askStr("Enter ID find Item:->"));
        if (findId != null) {
            System.out.println("Find item by ID:" + findId.getId() + " Name " + findId.getName() + ".");
        } else {
            System.out.println("No such ID was found!");
        }
        return true;
    }
}
