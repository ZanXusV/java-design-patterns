package com.zanxus.javacodegeeks.patterns.decoratorpattern;

/**
 * @author root
 * @create 2016-12-27 10:20 PM
 */
public abstract class PizzaDecorator implements Pizza {

    @Override
    public String getDesc() {
        return "Toppings";
    }
}
