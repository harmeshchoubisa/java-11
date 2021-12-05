package com.learn.functionalinterface;

public class Car {

     private String brand;
     private boolean hasPowerPeakUp;
     private boolean isHybrid;

    public Car(String brand, boolean hasPowerPeakUp, boolean isHybrid) {
        this.brand = brand;
        this.hasPowerPeakUp = hasPowerPeakUp;
        this.isHybrid = isHybrid;
    }

    public String getBrand() {
        return brand;
    }

    public boolean hasPowerPeakUp() {
        return hasPowerPeakUp;
    }

    public boolean isHybrid() {
        return isHybrid;
    }
}
