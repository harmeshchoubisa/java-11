package com.learn.javacoreapis;

import java.util.Arrays;

public class UsingArray {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
             numbers[i] = i + 5;
        System.out.println(Arrays.toString(numbers));

        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
    }
}
