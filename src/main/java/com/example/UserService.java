package com.example;

import java.util.List;
import java.util.Optional;

public class UserService {

    public void printAdultUsers(List<User> users) {
        Optional.ofNullable(users)
                .stream()
                .flatMap(List::stream)
                .filter(user -> user.age() != null && user.age() >= 18)
                .map(user -> user.name().toUpperCase() + " é adulto")
                .forEach(System.out::println);
    }
}
