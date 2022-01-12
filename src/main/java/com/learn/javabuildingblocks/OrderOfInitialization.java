package com.learn.javabuildingblocks;

/**
*Fields & instance initializer blocks are run in the order 
*in which they appear in the file.
*
*The constructor runs after all fields & instance
*initializer blocks have run. 
*/

public class OrderOfInitialization {

String name = "First name";
{System.out.println("setting field");}

public OrderOfInitialization() {
name = "Last name";
System.out.println("setting constructor");
}

public static void main(String... args) {

OrderOfInitialization o = new OrderOfInitialization();
o.name = "Different name";
System.out.println("The value of name variable is " +o.name);

}

}
