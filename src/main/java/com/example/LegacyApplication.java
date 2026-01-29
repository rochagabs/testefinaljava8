package com.example;

import java.util.Arrays;
import java.util.List;

public class LegacyApplication {

    public static void main(String[] args) {
        UserService service = new UserService();

        List<User> users = Arrays.asList(
                new User("Ana", 25),
                new User("Bruno", 17),
                new User("Carlos", 30)
        );

        service.printAdultUsers(users);
    }
}
