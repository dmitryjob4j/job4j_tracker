package ru.job4j.collection;

import java.util.HashSet;

/**
 * 0. Set, HashSet, Iterator.[#242863]
 *
 * @since 17.04.2020
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
