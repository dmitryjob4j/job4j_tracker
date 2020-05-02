package ru.job4j.stream;

import java.util.Objects;

/**
 * 2. Stream API
 * 2. Список адресов[#242707]
 * задание применить метод map
 * модель данных адресс
 *
 * @author D.Stepanov
 * @since 2.05.2020
 */
public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getHome() {
        return home;
    }

    public Address setHome(int home) {
        this.home = home;
        return this;
    }

    public int getApartment() {
        return apartment;
    }

    public Address setApartment(int apartment) {
        this.apartment = apartment;
        return this;
    }

    @Override
    public String toString() {
        return "city='" + "Address{" + city + '\'' + ", street='" + street + '\'' + ", home=" + home + ", apartment=" + apartment + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return home == address.home
                && apartment == address.apartment
                && Objects.equals(city, address.city)
                && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }
}
