package ru.job4j.lambda;

import java.util.List;
import org.junit.jupiter.api.Test;
import static ru.job4j.lambda.OptionalOrElseThrow.*;

import static org.junit.jupiter.api.Assertions.*;

class OptionalOrElseThrowTest {

    @Test
    public void whenFound() {
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        assertEquals(u3.getLogin(), OptionalOrElseThrow.orElseThrow(
                List.of(u1, u2, u3), u3.getLogin()
        ).getLogin());
    }

    @Test
    public void whenNotFound() {
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        assertThrows(UserNotFoundException.class,
                () -> OptionalOrElseThrow.orElseThrow(List.of(u1, u2, u3), "u4"));
    }
}