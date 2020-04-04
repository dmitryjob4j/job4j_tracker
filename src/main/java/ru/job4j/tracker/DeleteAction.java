package ru.job4j.tracker;

/**
 * Delete Item
 */
public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String delId = input.askStr("Enter ID delete Item:->");
        //Item delItem = tracker.findById(delId);
        if (tracker.delete(delId)) {
            System.out.println("Item delete.");
        } else {
            System.out.println("No such ID was found!");
        }
        return true;
    }
}
