package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * 0.3. Тестирование исключений с junit[#242901]
 * Задание.
 *
 * @since 05.04.2020
 */
public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void factIsNegativ() {
        Fact fact = new Fact();
        fact.calc(-1);
    }

    @Test
    public void factIs5to() {
        Fact fact = new Fact();
        int rsl = fact.calc(5);
        assertThat(rsl, is(120));
    }
}
