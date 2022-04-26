package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int index = 0;
        User user = null;
        for (int i = 0; i < users.length; i++){
        if (users[i].getUsername().equals(login)) {
                user = users[i];
            break;
        }
      }
        if (users[index].getUsername() != login) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        int symbol = user.getUsername().length();
        if (user.isValid() == true && symbol > 3 ) {
            rsl = true;
        } else {
            throw new UserInvalidException("Пользователь не валидный");
        }

        return rsl;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        }
        catch (UserInvalidException e) {
            e.printStackTrace();
        }
        catch (UserNotFoundException el) {
            el.printStackTrace();
        }
    }
}
