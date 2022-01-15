package com.learn.operators;

import java.io.File;

public class EqualityOperator {

public static void main (String... args) {

// Even though all of the variables point to the same file information,
// only two references, tuesday and wednesday,
// are equal in terms of == since they point to the same object.

File monday = new File("schedule.txt");
File tuesday = new File("schedule.txt");
File wednesday = tuesday;
System.out.println(monday == tuesday);    // false
System.out.println(tuesday == wednesday); // true

System.out.print(null == null);  // true


}
}
