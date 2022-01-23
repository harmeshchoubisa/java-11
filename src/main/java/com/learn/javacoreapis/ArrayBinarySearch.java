package com.learn.javacoreapis;

import java.util.Arrays;

/**
 *
 * Target element found in sorted array -> Index of match
 * Target element not found in sorted array -> Negative value showing one smaller
 * than the negative of the index, where a match needs to be inserted to preserve sorted order
 *
 */

public class ArrayBinarySearch {

    public static void main(String[] args) {

        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5


        //When testing below example, line 29 correctly gave 1 as the output.
        // However, line 30 gave the wrong answer as it is unpredictable

        int[] numbersUnsorted = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbersUnsorted, 2)); //1
        System.out.println(Arrays.binarySearch(numbersUnsorted, 3)); // unpredictable
    }
}
