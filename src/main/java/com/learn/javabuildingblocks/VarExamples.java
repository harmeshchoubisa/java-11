package com.learn.javabuildingblocks;

public class VarExamples {

public static void main (String... args) {

// var question;   // DOES NOT COMPLILE because 
// question = 1;   // compiler does not know what to make of them as 
                   // the declaration is not on the same line

var silly
    = 1;  // THIS WILL COMPILE as the declaration & initialization is done on this line

// int a, var b = 3; // DOES NOT COMPILE
                     // the types declared on a single line
                     // must be of the same type and share the same declaration.

// var n = null;     // DOES NOT COMPILE
                     

// var a = 2, b = 3; // DOES NOT COMPILE
                     // Java does not allow var in multiple variable declarations.
}


}
