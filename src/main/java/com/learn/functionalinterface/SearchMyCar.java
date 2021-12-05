package com.learn.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchMyCar {

    public static void main(String[] args) {
        //List of cars
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("toyota", true, true));
        cars.add(new Car("bmw", true, false));
        cars.add(new Car("audi", false, true));

        checkMyCar(cars, car -> car.isHybrid());
    }

    /**
     * Lambdas work with interfaces that have only one abstract method
     * but it is not wise to create always interface to use Lambdas, hence
     * Java introduced predefined interface with only one abstract method
     * that can be used for lambdas.
     *
     * @param cars
     * @param checker
     */
    private static void checkMyCar(List<Car> cars, Predicate<Car> checker) {

        for (Car car : cars) {
            if (checker.test(car)) {
                System.out.println("This is a hybrid car ->" + car.getBrand());
            }
        }
        System.out.println();
    }
}
