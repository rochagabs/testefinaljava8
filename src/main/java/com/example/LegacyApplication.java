package com.example;

import java.util.List;

public class LegacyApplication {

    public static void main(String[] args) {
        var service = new UserService();

        var users = List.of(
                new User("Ana", 25),
                new User("Bruno", 17),
                new User("Carlos", 30)
        );

        service.printAdultUsers(users);
    }
}
