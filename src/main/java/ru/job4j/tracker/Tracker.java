package ru.job4j.tracker;

import java.util.*;

/**
 * 5. Реализовать класс Tracker[#242937]
 * задание.
 *
 * @version 5
 * @since 27.03.2020
 */
public class Tracker {
    /**
     * Массив для хронения заявок на 100 элементов.
     */
    private final List<Item> items = new ArrayList<>();
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
        items.add(item);
        Collections.sort(items, new SortByNameItem());
        return item;
    }

    /**
     * 2 метод получение списка всех заявок без Null
     *
     * @return возврощаем заполненый массив без ячеек Null.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * 3 метод получение списка по имени
     *
     * @param key имя по которому ищем
     * @return возвращаем новый массив имен
     */
    public List<Item> findByName(String key) {
        List<Item> byName = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                byName.add(item);
            }
        }
        return byName;
      /*  Item[] byName = new Item[size];
        int num = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name.getName().equals(key)) {
                byName[num] = name;
                num++;
            }
        }
        return Arrays.copyOf(byName, num);*/
    }

    /**
     * 4 Метод получение заявки по ID
     *
     * @param id заявки которую ищем.
     */
    public Item findById(String id) {
        //Находим индекc
        int i = indexOf(id);
        //Если индекс найден возвращаем item, иначе null
        return i != -1 ? items.get(i) : null;
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

    /**
     * Метод возврощает index по ID
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    /**
     * 6 метод замены заявки replace.
     */
    public boolean replace(String id, Item item) {
        int i = indexOf(id);
        boolean result = false;
        if (i != -1) {
            item.setId(items.get(i).getId());
            items.set(i, item);
            result = true;
        }
        return result;
    }

    /**
     * 7. метод удаления заявки
     */
    public boolean delete(String id) {
        int i = indexOf(id);
        boolean result = true;
        if (i != -1) {
            items.remove(i);
        } else {
            result = false;
        }
        return result;
    }
}