package com.zanxus.javacodegeeks.patterns.bridgepattern;

/**
 * @author zanxus
 * @create 2016-12-01 10:22 PM
 */
public class TestBridgePattern {

    public static void main(String[] args) {
        Product central = new CentralLocking("Central Locking System");
        Product gear = new GearLocking("Gear Locking System");

        Car car = new BigWheel(central,"BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new BigWheel(gear,"BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Motoren(central,"Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Motoren(gear, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

    }
}
