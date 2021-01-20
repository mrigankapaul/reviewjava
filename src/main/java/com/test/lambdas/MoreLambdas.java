package com.test.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class MoreLambdas {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("one", "two","three"));

        Consumer<String> consumer = s -> System.out.println(s);
        strings.forEach(consumer);

        Predicate <String>  predicate = (String s) -> s.startsWith("t");
        strings.removeIf(predicate);
        System.out.println(strings);
    }
}
