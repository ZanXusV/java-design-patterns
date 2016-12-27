package com.zanxus.javacodegeeks.patterns.decoratorpattern;

/**
 * @author root
 * @create 2016-12-27 10:32 PM
 */
public class Spinach extends PizzaDecorator {

    private final Pizza pizza;

    public Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Spinach (7.92)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 7.92;
    }
}
