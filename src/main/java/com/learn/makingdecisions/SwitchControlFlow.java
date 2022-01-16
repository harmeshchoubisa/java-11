package com.learn.makingdecisions;

/**
 * Below are the allowed switch values in Java 11
 * int and Integer byte and Byte short and Short char and Character String
 * enum value
 * var (if the type resolves to one of the preceding types)
 */

public class SwitchControlFlow {

    public static void main(String[] args) {

       importanceOfBreakInSwitch();
       executionWithoutBreakInSwitch();
    }

    /**
     * The code will jump to the default block and then execute
     * all the proceeding case statements in order until it
     * finds a break statement or finishes the switch statement:
     */

    private static void executionWithoutBreakInSwitch() {

        var dayOfWeek = 5;
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break; }
    }

    private static void importanceOfBreakInSwitch() {

        int dayOfWeek = 5;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }


}
