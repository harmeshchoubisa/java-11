package com.learn.javacoreapis;

/**
 * String pool contains literal values and constants that appear in your program.
 * For example, "name" is a literal and therefore goes into the string pool.
 * myObject.toString() is a string but not a literal, so it does not go into the string pool.
 */

public class StringPool {

    public static void main(String[] args) {

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y);    // true

        String singleString = "hello world";
        String oneLine = "hello " + "world";
        String concat = " hello";
        concat += "world";
        System.out.println(singleString == oneLine);  //false
        System.out.println(singleString == concat);   //false  Concatenation is just like calling a method and results in a new String

        String a = "Hello World"; // This says to use the string pool normally.
        String b = new String("Hello World"); // This says "No, JVM, I really don’t want you to use the string pool. Please create a new object for me even though it is less efficient."
        System.out.println(a == b); // false

        String name = "Hello World";
        String name2 = new String("Hello World").intern(); // now we are telling to use the string pool
        System.out.println(name == name2);     // true

        String first = "rat" + 1;  // a compile-time constant that automatically gets placed in the string pool as "rat1
        String second = "r" + "a" + "t" + "1"; // a more complicated expression that is also a compile-time constant
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());

    }
}
