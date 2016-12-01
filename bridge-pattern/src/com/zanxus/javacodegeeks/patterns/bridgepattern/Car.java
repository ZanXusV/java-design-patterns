package com.zanxus.javacodegeeks.patterns.bridgepattern;

/**
 * @author zanxus
 * @create 2016-12-01 10:12 PM
 */
public abstract class Car {

    private final Product product;
    private final String carType;

    public Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails(){
        System.out.println("Car: "+carType+", Product: "+product.productName());
    }
}
