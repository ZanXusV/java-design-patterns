package com.zanxus.javacodegeeks.patterns.builderpattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-15-下午7:43
 */
public class TestBuilderPattern {

    public static void main(String[] args) {
        CarBuilder carBuilder = new SedanCarBuilder();
        CarDirector director = new CarDirector(carBuilder);
        director.build();
        Car car = carBuilder.getCar();
        System.out.println(car);

        System.out.println();

        carBuilder = new SportsCarBuilder();
        director = new CarDirector(carBuilder);
        director.build();
        car = carBuilder.getCar();
        System.out.println(car);
    }
}
