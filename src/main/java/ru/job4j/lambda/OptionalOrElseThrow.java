package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOrElseThrow {

    public static class User {

        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException { }

    public static User orElseThrow(List<User> list, String login) {
        User user = null;
        for (User currUser : list) {
            if (login.equals(currUser.getLogin())) {
                user = currUser;
                break;
            }
        }
        return Optional.ofNullable(user).orElseThrow(UserNotFoundException::new);
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> user = Optional.empty();
        for (User currUser : list) {
            if (login.equals(currUser.getLogin())) {
                user = Optional.of(currUser);
            }
        }
        return user;
    }

}