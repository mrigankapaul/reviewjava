package com.test.lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambdas {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println("c1 consumes " + s);
        Consumer<String> c2 = s -> System.out.println("c2 consumes " + s);
        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("Hello");

        Predicate<String> isNull = s -> s==null;
        Predicate<String> isEmpty = s -> s.isEmpty();
        Predicate<String> isNullOrEmpty = isNull.negate().and(isEmpty.negate());

        System.out.println(isNullOrEmpty.test(null));
        System.out.println(isNullOrEmpty.test(""));
        System.out.println(isNullOrEmpty.test("Hello"));
    }
}
