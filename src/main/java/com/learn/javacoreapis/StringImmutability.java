package com.learn.javacoreapis;

/**
 * In real world scenario setter method converts the class to mutable.
 * If we want to ensure immutability we can just keep only getter methods.
 */
public class StringImmutability {

    public static void main(String[] args) {

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3"); // String class is immutable so s2 will not change/mutate hence output will be 12
        System.out.println(s2);
    }
}
