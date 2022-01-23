package com.learn.javacoreapis;

import static java.util.Arrays.compare;

public class ComparingArrays {

    public static void main(String[] args) {

        System.out.println(compare(new int[] {1,2}, new int[] {1})); // positive
        System.out.println(compare(new int[] {1}, new int[] {1,2})); // negative
        System.out.println(compare(new int[] {1,2}, new int[] {1,2})); // zero
        System.out.println(compare(new int[] {1,2}, new int[] {2,1})); // negative
        System.out.println(compare(new String[] {"a"}, new String[] {"aa"})); // negative
        System.out.println(compare(new String[] {"a"}, new String[] {"A"})); // positive
        System.out.println(compare(new String[] {"a"}, new String[] {null})); // positive
        System.out.println(compare(new String[] {"a"}, new String[] {"null"})); // negative
        System.out.println(compare(new String[] {"a"}, new String[] {"1"})); // positive

    }
}
