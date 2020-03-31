package ru.job4j.tracker;

import java.util.Scanner;
import java.util.TimerTask;

/**
 * 2.1. Реализация класса StartUI[#242892]
 *
 * @version 2
 * @since 30.03.2020
 */
public class StartUI {
    public void init(Scanner scaner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scaner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name:->");
                String name = scaner.nextLine();
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
                System.out.print("Enter ID edit Item:->");
                String edit = scaner.nextLine();
                Item item = new Item(null);
                if (tracker.replace(edit,item)) {
                    System.out.print("Enter new name Item:->");
                    item.setName(scaner.nextLine());
                    tracker.replace(edit, item);
                    System.out.println("Replace item: " + tracker.findById(edit).getId() + " " + tracker.findById(edit).getName() + ".");
                } else {
                    System.out.println("No such ID was found!");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.print("Enter ID delete Item:->");
                String delId = scaner.nextLine();
                Item delItem = tracker.findById(delId);
                if (tracker.delete(delId)) {
                    tracker.delete(delId);
                    System.out.println("Item ID: " + delItem.getId() + " Name " + delItem.getName() + " delete.");
                } else {
                    System.out.println("No such ID was found!");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ===");
                System.out.print("Enter ID find Item:->");
                String id = scaner.nextLine();
                if (tracker.findById(id) != null) {
                    Item findId = tracker.findById(id);
                    System.out.println("Find item by ID:" + findId.getId() + " Name " + findId.getName() + ".");
                } else {
                    System.out.println("No such ID was found!");
                }
            } else if (select == 5) {
                System.out.println("=== Find Item by name ===");
                System.out.print("Enter NAME find Item:->");
                String findName = scaner.nextLine();
                Item[] item = tracker.findByName(findName);
                System.out.print("find Name:");
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
        System.out.println("Select: ->");
        // добавить основной пункт меню.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
