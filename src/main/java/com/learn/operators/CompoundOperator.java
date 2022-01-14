package com.learn.operators;


public class CompoundOperator {

public static void main(String... args) {

long goat = 5;
int sheep = 5;
// sheep = sheep * goat;   // DOES NOT COMPILE

//The compound operator will first cast cat to a long,
// apply the multiplication of two long values, and then cast the result to an int.

long dog = 10;
int cat = 5;
cat *= dog;    // THIS WILL COMPILE

}
}
