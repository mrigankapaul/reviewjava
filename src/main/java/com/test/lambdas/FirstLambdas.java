package com.test.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Supplier
// Consumer
// Predicates
// Functions
// Runnable
// for lambdas the byte code expression is invoke dynamic - Performance of lambdas is 60x faster than inner classes.
// Autoboxing is a method used by the compiler to convert an primitive type like int to an Object in this case Integer.

// IntPredicate
// LongSupplier
// IntFunction
// LongToIntFunction

public class FirstLambdas {
    public static void main(String[] args) {

        // Supplier
        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());

        // Consumer
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("Hello From Consumer");

        // Multi-line Consumer
        Consumer<String> multiLineConsumer = (String s) -> {
            System.out.println("Hello From Inside the comusmer");
            System.out.println(s);
        };
        multiLineConsumer.accept("Hello From Consumer");

        // Predicates
        Predicate<String>  predicate = (String s) -> s.equalsIgnoreCase("hello");
        System.out.println(predicate.test("Hello"));

        Function<String, Integer> function =  (String s) -> s.length();
        System.out.println(function.apply("hello"));

        Runnable r = () -> System.out.println("This from run");
        r.run();
    }
}
