package ru.job4j.stragery;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.StringJoiner;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        //получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        //созлаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //заменяем стандартный вывод на вывод в память для тестирования.
        System.setOut(new PrintStream(out));
        //выполняем действия пишушие в консоль.
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
        //возврощаем обратно стандартный вывод в консоль
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        //получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        //созлаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //заменяем стандартный вывод на вывод в память для тестирования.
        System.setOut(new PrintStream(out));
        //выполняем действия пишушие в консоль.
        new Paint().draw(new Triangle());
        //Проверяем результат вычисления
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
        //возврощаем обратно стандартный выводв консоль
        System.setOut(stdout);
    }
}
