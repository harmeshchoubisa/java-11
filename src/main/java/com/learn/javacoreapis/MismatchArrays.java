package com.learn.javacoreapis;

import static java.util.Arrays.mismatch;

public class MismatchArrays {

    public static void main(String[] args) {
        System.out.println(mismatch(new int[]{1}, new int[]{1}));   // -1
        System.out.println(mismatch(new String[]{"a"}, new String[]{"A"}));  // 0
        System.out.println(mismatch(new int[]{1, 2}, new int[]{1})); // 1
    }
}
