package com.zanxus.javacodegeeks.patterns.decoratorpattern;

/**
 * @author root
 * @create 2016-12-27 10:19 PM
 */
public class SimplyVegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "SimpleVegPizza (230) ";
    }

    @Override
    public double getPrice() {
        return 230;
    }
}

