package ru.job4j.tracker.poly;

/**
 * 3. Интерфейс Input[#242883]
 * задание
 *
 * @since 30.03.2020
 */
public interface Transport {
    void transport();

    void passenger(int human);

    double price(double liter);
}
