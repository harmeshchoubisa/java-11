package com.learn.operators;

public class NumericPromotions {

public static void main (String... args) {

promotionToLargerDataType();
promotionToLargerDataTypeTricky();
promotionOfSmallerDataTypes();
}

/**
* If two values have different data types,
* Java will automatically promote one of the values to the larger of the two data types.
*/
public static void promotionToLargerDataType() {

int x = 5;
long y = 33;
var z = x * y; 
System.out.println ("Value of z is " +z);

}

/**
* The code will not compile as 
* floating-point literals are assumed to be double,
* unless postfixed with an f, as in 2.1f
*/
public static void promotionToLargerDataTypeTricky() {

double x = 39.21;
//float y = 2.1;
//var z = x + y;
//System.out.println ("Value of z is " +z);

}

/**
* Smaller data types, namely, byte, short, and char, are first promoted 
* to int any time they’re used with a Java binary arithmetic operator,
* even if neither of the operands is int
*/
public static void promotionOfSmallerDataTypes() {

short a = 3;
short b = 5;
var c = a * b;
System.out.println("Value of c is " +c);

}
}
