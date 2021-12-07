package com.learn.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Supplier is used when we need to generate
 * a value. Same like Consumer it also has only one method
 * ie T get()
 */
public class SupplierConcept {

    public static void main(String[] args) {

        Supplier<Integer> number = () -> 42;
        Supplier<Integer> random = () -> new Random().nextInt();

        System.out.println(returnNumber(random));
    }

    private static Integer returnNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
