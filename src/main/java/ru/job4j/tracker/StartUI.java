package ru.job4j.tracker;

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
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select <= 6 && select >= 0) {
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            } else {
                System.out.println("!!! There is no such item !!!");
            }
        }
    }

    /**
     * метод массив вывода пункты меню
     */
    private void showMenu(UserAction[] action) {
        System.out.println("+++ Menu +++");
        for (int index = 0; index < action.length; index++) {
            System.out.println(index + ". " + action[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new AllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindIdAction(),
                new FindNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
