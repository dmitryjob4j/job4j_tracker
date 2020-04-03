package ru.job4j.tracker.pojo;
import org.junit.Test;
import ru.job4j.tracker.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem(){
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        CreateAction createAction = new CreateAction();
        createAction.execute(input, tracker);
        Item created = tracker.findAll() [0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(),is(expected.getName()));
    }
    @Test
    public void whenReplaceItem(){
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId(), "replaced item"};
        ReplaceAction replaceAction = new ReplaceAction();
        replaceAction.execute(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
    @Test
    public void whenDeleteItem(){
        Tracker tracker = new Tracker();
        Item item = new Item("delete item");
        String expected = item.getId();
        tracker.add(item);
        String[] answers = {item.getId()};
        String deleteItem = item.getId();
        DeleteAction deleteAction = new DeleteAction();
        deleteAction.execute(new StubInput(answers),tracker);
        assertThat(tracker.findById(deleteItem),is(expected));
    }
}
