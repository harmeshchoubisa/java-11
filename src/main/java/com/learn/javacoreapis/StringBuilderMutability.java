package com.learn.javacoreapis;

public class StringBuilderMutability {

    /**
     * Both will print abcdefg as on line 13 b is referring the same
     * object created on line 12.
     * @param args
     */

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        nextConcept();
    }

    /**
     * substring() returns a String rather than a StringBuilder.
     * That is why sb is not changed. substring() is really just a
     * method that inquires about what the state of the StringBuilder happens to be.
     */

    private static void nextConcept() {

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
    }
}
