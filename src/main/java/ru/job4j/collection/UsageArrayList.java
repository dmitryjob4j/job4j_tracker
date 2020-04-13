package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Petr");
        name.add("Ivan");
        name.add("Dmitry");
        for (Object value : name) {
            System.out.println(value);
        }
    }
}
