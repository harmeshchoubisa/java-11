package com.learn.javabuildingblocks;


public class LiteralNUnderscoreChar {

//double notAtStart = _1000.00; // DOES NOT COMPILE
//double notAtEnd = 1000.00_; // DOES NOT COMPILE
//dobule notByDecimal = 1000_.00; // DOES NOT COMPILE
double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
double reallyUgly = 1______2; // Also compiles

public static void main(String... args) {
}
}
