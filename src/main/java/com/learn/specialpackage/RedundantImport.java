package com.learn.specialpackage;

import java.lang.System;
import java.lang.*;
import java.util.Random;

/**
 * This class demonstrates the concept of default package
 * i.e java.lang is a default package being imported in all classes
 * The above imports on Line 3, 4 and 6 are redundant.
 */
public class RedundantImport {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));

    }
}
