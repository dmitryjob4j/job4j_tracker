package ru.job4j.tracker;

/**
 * Replace Item
 */
public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String edit = input.askStr("Enter ID edit Item:->");
        Item item = new Item(input.askStr("Enter new name Item:->"));
        if (tracker.replace(edit, item)) {
            System.out.println("Replace item: " + tracker.findById(edit).getId() + " " + tracker.findById(edit).getName() + ".");
        } else {
            System.out.println("No such ID was found!");
        }
        return true;
    }
}
