package com.learn.operators;

public class LogicalOperator {

public static void main (String... args) {

boolean eyesClosed = true;
boolean breathingSlowly = true;

// The logical operators always executes all conditions 
// even if first one is true in OR 
// if(eyesClosed | breathingSlowly) both will be executed

boolean resting = eyesClosed | breathingSlowly;
boolean asleep = eyesClosed & breathingSlowly;
boolean awake = eyesClosed ^ breathingSlowly;
System.out.println(resting);  // true
System.out.println(asleep);   // true
System.out.println(awake);    // false

} 
}
