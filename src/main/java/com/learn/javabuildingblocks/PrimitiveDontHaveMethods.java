
package com.learn.javabuildingblocks;

public class PrimitiveDontHaveMethods {

public static void main(String... args) {

String reference = "hello";
int len = reference.length(); // Good, as reference have methods 
//int bad = len.length(); // DOES NOT COMPILE as primitive types dont have methods
System.out.println("Length of the string is" +len);

}
}
