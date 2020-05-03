package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Stream API
 * 3. Уникальность элементов и сортировка.[#242708]
 * задание исключение дубликато и сортировка
 *
 * @author D.Stepanov
 * @since 3.05.2020
 */
public class Profiles {
    /**
     * @param profiles
     * @return
     */
    public List<Address> collect(List<Profile> profiles) {
        /*Comparator<Address> comparator = (l, r) -> l.getCity().compareTo(r.getCity());*/
        List<Address> result = profiles.stream().map(
                profile -> profile.getAddress()
        ).sorted(Comparator.comparing(Address::getCity)).distinct().collect(Collectors.toList());
        return result;
    }
}
