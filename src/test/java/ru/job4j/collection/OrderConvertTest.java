package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * 2. Преобразования List в Map.[#242858]
 * Тест
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 18.04.2020
 */
public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> oreders = new ArrayList<>();
        oreders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(oreders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }
}
