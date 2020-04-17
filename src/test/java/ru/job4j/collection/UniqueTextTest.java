package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * 2. Идентичные тексты.[#242861]
 * Тест
 *
 * @author Dmitry Stepanov
 * @version 1
 * @since 17.04.2020
 */
public class UniqueTextTest {
    @Test
    public void isEquals() {
        String origin = "My cat eats a mause";
        String text = "My cat eats a mause";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mause";
        String text = "A mause is eaten by a cat";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }

    @Test
    public void isEqualsWordMix() {
        String origin = "My cat eats a mause";
        String text = "My mause eats a cat";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }
}
