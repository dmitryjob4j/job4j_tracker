package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Stream API
 * 2. Список адресов[#242707]
 * задание применить метод map
 *
 * @author D.Stepanov
 * @since 2.05.2020
 */
public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> result = profiles.stream().map(
                profile -> profile.getAddress()
        ).collect(Collectors.toList());
        return result;
    }
}
