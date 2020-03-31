package ru.job4j.tracker;

import java.util.TimerTask;

/**
 * 2.1. Реализация класса StartUI[#242892]
 *
 * @version 2
 * @since 30.03.2020
 */
public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ->");
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name:->");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all Items ===");
                Item[] allItem = tracker.findAll();
                for (int i = 0; i < allItem.length; i++) {
                    System.out.println("ID: " + allItem[i].getId() + " Name: " + allItem[i].getName() + ".");
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ===");
                String edit = input.askStr("Enter ID edit Item:->");
                Item item = new Item(null);
                if (tracker.replace(edit, item)) {
                    item.setName(input.askStr("Enter new name Item:->"));
                    tracker.replace(edit, item);
                    System.out.println("Replace item: " + tracker.findById(edit).getId() + " " + tracker.findById(edit).getName() + ".");
                } else {
                    System.out.println("No such ID was found!");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                String delId = input.askStr("Enter ID delete Item:->");
                Item delItem = tracker.findById(delId);
                if (tracker.delete(delId)) {
                    tracker.delete(delId);
                    System.out.println("Item ID: " + delItem.getId() + " Name " + delItem.getName() + " delete.");
                } else {
                    System.out.println("No such ID was found!");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ===");
                String id = input.askStr("Enter ID find Item:->");
                if (tracker.findById(id) != null) {
                    Item findId = tracker.findById(id);
                    System.out.println("Find item by ID:" + findId.getId() + " Name " + findId.getName() + ".");
                } else {
                    System.out.println("No such ID was found!");
                }
            } else if (select == 5) {
                System.out.println("=== Find Item by name ===");
                String findName = input.askStr("Enter NAME find Item:->");
                Item[] item = tracker.findByName(findName);
                System.out.println("find Name:");
                for (int i = 0; i < item.length; i++) {
                    System.out.println("ID: " + item[i].getId() + " Nsme: " + item[i].getName());
                }
            } else if (select == 6) {
                System.out.println("=== Exit program ===");
                run = false;
            } else {
                System.out.println("=== The menu does not exist, select an existing menu item! ===");
            }
        }
    }

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
