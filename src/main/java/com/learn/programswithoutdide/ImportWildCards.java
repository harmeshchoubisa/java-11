// It is teams preference to use individual imports or entire package imports.
// Importing all does not impact the performance as compiler knows
// what it needs to execute a program.

import java.util.*;

public class ImportWildCards {

public static void main (String... args) {

Random r = new Random();
System.out.println("Random numnber is " +r.nextInt(10));
}

}
