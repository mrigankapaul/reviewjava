package com.test.lambdas;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;


public class PrimitiveLambdas {
    public static void main(String[] args) {

        // specialized primitive lambdas for improving performance.

        IntSupplier supplier = () -> 2;
        System.out.println(supplier.getAsInt());

        DoubleToIntFunction function = value -> (int) Math.floor(value);
        System.out.println(function.applyAsInt(Math.PI));
    }
}
