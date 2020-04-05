package ru.job4j.ex;

/**
 * 0.5. Иерархия исключений и множественный catch.[#242903]
 * Задание.
 *
 * @since 05.04.2020
 */
public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = new User("", false);
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                user = users[i];
                break;
            }
        }
        if (user.getUsername().equals("")) {
            throw new UserNotFoundException("User not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rls = false;
        if (user.getUsername().length() > 3 && user.isValid()) {
            rls = true;
        } else {
            throw new UserInvalidException("User invalid");
        }
        return rls;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Dmitry Stepanov", true)
        };
        try {
            User user = findUser(users, "Dmitry Stepanov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            ie.printStackTrace();
        } catch (UserNotFoundException ne) {
            ne.printStackTrace();
        }
    }
}
