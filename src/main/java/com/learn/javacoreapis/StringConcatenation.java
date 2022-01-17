package com.learn.javacoreapis;

/**
 * 1. If both operands are numeric, + means numeric addition.
 * 2. If either operand is a String, + means concatenation.
 * 3. The expression is evaluated left to right.
 */

public class StringConcatenation {

    public static void main(String[] args) {

        System.out.println(1 + 2);               // 3
        System.out.println("a" + "b");           // ab
        System.out.println("a" + "b" + 3);       // ab3
        System.out.println(1 + 2 + "c");         // 3c
        System.out.println("c" + 1 + 2);         // c12
    }
}
