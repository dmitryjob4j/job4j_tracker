package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

/**
 * 4.2. Статические методы.[#242888]
 *
 * @version 5
 * @since 01.04.2020
 */
public class StartUI {

    /**
     * метод init
     *
     * @param input
     * @param tracker
     * @param actions
     */
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    /**
     * метод массив вывода пункты меню
     */
    private void showMenu(List<UserAction> action) {
        System.out.println("+++ Menu +++");
        for (int index = 0; index < action.size(); index++) {
            System.out.println(index + ". " + action.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new AllAction());
        actions.add(new ReplaceAction());
        actions.add(new DeleteAction());
        actions.add(new FindIdAction());
        actions.add(new FindNameAction());
        actions.add(new ExitAction());
 /*       UserAction[] actions = {
                new CreateAction(),
                new AllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindIdAction(),
                new FindNameAction(),
                new ExitAction()
        };*/
        new StartUI().init(validate, tracker, actions);
    }
}
