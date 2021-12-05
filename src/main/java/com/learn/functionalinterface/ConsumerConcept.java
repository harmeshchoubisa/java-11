package com.learn.functionalinterface;

import java.util.function.Consumer;

/**
 * We’ve declared functionality to print out the value we were given.
 * It’s okay that we don’t have a value yet.
 * When the consumer is called, the value will be provided and printed then.
 */

public class ConsumerConcept {

    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        checkingConsumerConcept(consumer, "Random value of x");
    }

    private static void checkingConsumerConcept(Consumer<String> consumer, String value) {
        consumer.accept(value);
    }
}
