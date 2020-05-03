package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 2. Stream API
 * 3. Уникальность элементов и сортировка.[#242708]
 * Тест
 *
 * @author D.Stepanov
 * @since 3.05.2020
 */
public class ProfilesTest {
    @Test
    public void whenStreamProfilesSortedByDistint() {
        List<Profile> input = List.of(
                new Profile(new Address("Krasnodar", "Lenina", 10, 200)),
                new Profile(new Address("Krasnodar", "Lenina", 10, 200)),
                new Profile(new Address("Adler", "Gogolya", 13, 5)),
                new Profile(new Address("Adler", "Gogolya", 13, 5))
        );
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(input);
        List<Address> expect = List.of(
                new Address("Adler", "Gogolya", 13, 5),
                new Address("Krasnodar", "Lenina", 10, 200)
        );
        assertThat(result, is(expect));
    }
}
