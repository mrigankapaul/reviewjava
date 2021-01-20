package com.test.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class User {
    private String name;
    private int age;

    public User() {

    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
public class SomeMapping {
    public static void main(String[] args) {
//        User sarah = new User("Sarah");
//        User james = new User("James");
//        User mary = new User("Mary");
//        User john = new User("John");
//        List<User> users = List.of(sarah, james, mary, john);
//
//        users.stream().map(User::getName).forEach(System.out::println);
    }
}
