package com.learn.makingdecisions;

public class AcceptableCaseValuesInSwitch {

    public static void main(String[] args) {

        feedAnimals();
        //complexExample("firstName", "lastName");
    }

//    private static int complexExample(String firstName, final String
//            lastName) {
//        String middleName = "Patricia";
//        final String suffix = "JR";
//        int id = 0;
//        switch (firstName) {
//            case "Test":
//                return 52;
//            case middleName:  // DOES NOT COMPILE, although initialized but expected a final constant
//                id = 5;
//                break;
//            case suffix:
//                id = 0;
//                break;
//            case lastName: //Despite lastName being final, it is not constant as it is passed to the function
//                id = 8;
//                break;
//            //case 5:     // Diff type
//                id = 7;
//                break;
//            //case 'J':   // Diff type
//                id = 10;
//                break;
//            //case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE Enum is diff type
//                id = 15;
//                break;
//        }
//        return id;
//    }


    static void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
                //  case apples:  // DOES NOT COMPILES As constant expression is required here
                //  case getCookies():  // DOES NOT COMPILE value is being known at runtime
                //  case cookies :  // DOES NOT COMPILE value is being known at runtime
            case 3 * 5:
        }
    }

    final static int getCookies() {
        return 4;
    }
}
