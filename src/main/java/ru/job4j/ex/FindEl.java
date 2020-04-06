package ru.job4j.ex;

/**
 * 0.4. Пользовательские исключения.[#242902]
 * задание
 *
 * @since 05.04.2020
 */
public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = new String[]{"a", "b", "c", "d"};
        try {
            indexOf(value, "i");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
