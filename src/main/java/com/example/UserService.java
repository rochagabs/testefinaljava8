package com.example;

import java.util.List;
import java.util.Optional;

public class UserService {

    public void printAdultUsers(List<User> users) {

        if (users == null || users.size() == 0) {
            System.out.println("Lista vazia");
            return;
        }

        for (User user : users) {
            Optional<Integer> age = Optional.ofNullable(user.getAge());

            if (age.isPresent() && age.get() >= 18) {
                System.out.println(
                        user.getName().toUpperCase() + " é adulto"
                );
            }
        }
    }
}
