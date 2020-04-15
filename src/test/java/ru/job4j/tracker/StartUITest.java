package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.ex.User;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        ArrayList<UserAction> userActions = new ArrayList<>();
        userActions.add(action);
        new StartUI().init(input, new Tracker(), userActions);
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        ArrayList<UserAction> userActions = new ArrayList<>();
        userActions.add(action);
        new StartUI().init(input, new Tracker(), userActions);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("+++ Menu +++")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
