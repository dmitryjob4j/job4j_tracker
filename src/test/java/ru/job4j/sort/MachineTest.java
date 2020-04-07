package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Сдача в кофе машине.[#34741]
 *
 * @author Dmirty Stepanov[#242692]
 * @version 1
 * @since 07.04.2020
 */
public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 5, 2, 2};
        int[] rsl = machine.change(50, 21);
        assertThat(rsl, is(expected));
    }
}
