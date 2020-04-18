package ru.job4j.collection;

import java.util.Map;
import java.util.HashMap;

/**
 * 0. Map, HashMap[#242855]
 * задание
 *
 * @since 18.04.2020.
 */
public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("haoos@inbox.ru", "Dmitry Stepanov");
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        map.remove("parsentev@yandex.ru");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(System.lineSeparator() + key + " = " + value);
        }
    }
}
