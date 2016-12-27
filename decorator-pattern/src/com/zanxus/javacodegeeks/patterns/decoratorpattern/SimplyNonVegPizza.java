package com.zanxus.javacodegeeks.patterns.decoratorpattern;

/**
 * @author root
 * @create 2016-12-27 10:19 PM
 */
public class SimplyNonVegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "SimplyNonVegPizza (350) ";
    }

    @Override
    public double getPrice() {
        return 350;
    }
}
