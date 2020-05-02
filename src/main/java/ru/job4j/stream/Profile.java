package ru.job4j.stream;

import java.util.Objects;

/**
 * 2. Stream API
 * 2. Список адресов[#242707]
 * задание применить метод map
 * модель данных клиента
 *
 * @author D.Stepanov
 * @since 2.05.2020
 */
public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Profile{" + "address=" + address + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile profile = (Profile) o;
        return Objects.equals(address, profile.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
}
