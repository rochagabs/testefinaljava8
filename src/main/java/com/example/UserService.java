package com.example;

import java.util.List;
import java.util.Objects;

public class UserService {

    public void printAdultUsers(List<User> users) {

        if (users == null || users.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        users.stream()
             .filter(Objects::nonNull)
             .filter(user -> user.age() != null && user.age() >= 18)
             .forEach(user -> System.out.println(
                     user.name().toUpperCase() + " é adulto"
             ));
    }
}
