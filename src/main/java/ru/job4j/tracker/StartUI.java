package ru.job4j.tracker;

import java.util.TimerTask;

/**
 * 4.2. Статические методы.[#242888]
 *
 * @version 5
 * @since 01.04.2020
 */
public class StartUI {
    /**
     * Статический метод Create Item
     *
     * @param input
     * @param tracker
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name:->");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void allItem(Tracker tracker) {
        System.out.println("=== Show all Items ===");
        Item[] allItem = tracker.findAll();
        for (int i = 0; i < allItem.length; i++) {
            System.out.println("ID: " + allItem[i].getId() + " Name: " + allItem[i].getName() + ".");
        }
    }

    /**
     * Статический метод Replace Item
     *
     * @param input
     * @param tracker
     */
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        String edit = input.askStr("Enter ID edit Item:->");
        Item item = new Item(input.askStr("Enter new name Item:->"));
        if (tracker.replace(edit, item)) {
            System.out.println("Replace item: " + tracker.findById(edit).getId() + " " + tracker.findById(edit).getName() + ".");
        } else {
            System.out.println("No such ID was found!");
        }
    }

    /**
     * Статический метод Delete Item
     *
     * @param input
     * @param tracker
     */
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        String delId = input.askStr("Enter ID delete Item:->");
        Item delItem = tracker.findById(delId);
        if (tracker.delete(delId)) {
            System.out.println("Item ID: " + delItem.getId() + " Name " + delItem.getName() + " delete.");
        } else {
            System.out.println("No such ID was found!");
        }
    }

    /**
     * Статический метод find by ID
     *
     * @param input
     * @param tracker
     */
    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Id ===");
        Item findId = tracker.findById(input.askStr("Enter ID find Item:->"));
        if (findId != null) {
            System.out.println("Find item by ID:" + findId.getId() + " Name " + findId.getName() + ".");
        } else {
            System.out.println("No such ID was found!");
        }
    }

    /**
     * Статический метод find by name
     *
     * @param input
     * @param tracker
     */
    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find Item by name ===");
        Item[] item = tracker.findByName(input.askStr("Enter NAME find Item:->"));
        System.out.println("find Name:");
        for (int i = 0; i < item.length; i++) {
            System.out.println("ID: " + item[i].getId() + " Nsme: " + item[i].getName());
        }
    }

    /**
     * метод init
     *
     * @param input
     * @param tracker
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ->");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                System.out.println("=== Exit program ===");
                run = false;
            } else {
                System.out.println("=== The menu does not exist, select an existing menu item! ===");
            }
        }
    }

    /**
     * метод пункты меню
     */
    private void showMenu() {
        System.out.println("+++ Menu +++");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all Items");
        System.out.println("2. Edit Item");
        System.out.println("3. Delete Item");
        System.out.println("4. Find Item by Id");
        System.out.println("5. Find Item by name");
        System.out.println("6. Exit Program");
        // добавить основной пункт меню.
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
