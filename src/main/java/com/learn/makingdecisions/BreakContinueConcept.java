package com.learn.makingdecisions;

public class BreakContinueConcept {

    public static void main(String[] args) {
        int count = 0;
        BUNNY: for(int row = 1; row <=3; row++)
            RABBIT: for(int col = 0; col <3 ; col++) {
                if((col + row) % 2 == 0)
                  // break RABBIT;      break the RABBIT loop
                  // continue BUNNY;    continue to the bunny loop
                   break;              // break the last inner loop
                count++;
            }
        System.out.println(count);
    }
}
