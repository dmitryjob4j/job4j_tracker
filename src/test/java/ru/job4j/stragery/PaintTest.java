package ru.job4j.stragery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * 9.1 Рефакторинг теста @Before @After[#242879]
 *
 * @since 4.04.2020
 */
public class PaintTest {
    //получаем ссылку на стандартный вывод в консоль.
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    //созлаем буфер для хранения вывода.
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    //заменяем стандартный вывод на вывод в память для тестирования.
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    //возврощаем обратно стандартный вывод в консоль
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++")
                                .add("+  +")
                                .add("+  +")
                                .add("++++")
                                .add(System.lineSeparator())
                                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+")
                                .add("+ +")
                                .add("+  +")
                                .add("+++++")
                                .add(System.lineSeparator())
                                .toString()
                )
        );
    }
}
