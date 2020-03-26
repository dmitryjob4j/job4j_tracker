package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * 5. Реализовать класс Tracker[#242937]
 * задание.
 *
 * @version 1
 * @since 26.03.2020
 */
public class Tracker {
    /**
     * Массив для хронения заявок на 100 элементов.
     */
    private final Item[] items = new Item[100];
    private int ids = 1;
    /**
     * Указатель ячейки для новой заявки.
     */
    private int size = 0;

    /**
     * 1 метод добавление заявок
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[size++] = item;
        return item;
    }

    /**
     * 2 метод получение списка всех заявок без Null
     *
     * @return возврощаем заполненый массив без ячеек Null.
     */
    public Item[] findAll() {
        Item[] nameWithoutNull = new Item[size];
        int num = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name != null) {
                nameWithoutNull[num] = name;
                num++;
            }
        }
        return Arrays.copyOf(nameWithoutNull, num);
    }

    /**
     * 3 метод получение списка по имени
     *
     * @param key имя по которому ищем
     * @return возвращаем новый массив имен
     */
    public Item[] findByName(String key) {
        Item[] byName = new Item[size];
        int num = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name.getName().equals(key)) {
                byName[num] = name;
                num++;
            }
        }
        return Arrays.copyOf(byName, num);
    }

    /**
     * 4 Метод получение заявки по ID
     *
     * @param id заявки которую ищем.
     */
    public Item findById(String id) {
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId().equals(id)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод гененрации уникального ключа для заявок
     *
     * @return Уникальный ключ.
     **/
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
        //return String.valueOf(ids++);
    }
}