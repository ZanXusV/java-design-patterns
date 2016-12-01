package com.zanxus.javacodegeeks.patterns.bridgepattern;

/**
 * @author zanxus
 * @create 2016-12-01 10:07 PM
 */
public class CentralLocking implements Product{

    private final String productName;

    public CentralLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }
}
