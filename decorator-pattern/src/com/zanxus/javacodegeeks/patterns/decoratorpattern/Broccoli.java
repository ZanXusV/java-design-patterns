package com.zanxus.javacodegeeks.patterns.decoratorpattern;

/**
 * @author root
 * @create 2016-12-27 10:21 PM
 */
public class Broccoli extends PizzaDecorator {

    private final Pizza pizza;

    public Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 9.25;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Broccoli (9.25) ";
    }
}
