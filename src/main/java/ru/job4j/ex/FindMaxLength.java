package ru.job4j.ex;

/**
 * 0.1. java.lang.NullPointerException[#242899]
 * задача
 *
 * @since 04.04.2020
 */
public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        String el = null;
        for (int i = 0; i < shops.length; i++) {
            if (shops[i] != null) {
                el = shops[i];
            }
            if (el.length() > max) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}
