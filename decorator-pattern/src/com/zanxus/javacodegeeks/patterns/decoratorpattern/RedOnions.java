package com.zanxus.javacodegeeks.patterns.decoratorpattern;

/**
 * @author root
 * @create 2016-12-27 10:31 PM
 */
public class RedOnions extends PizzaDecorator {

    private final Pizza pizza;

    public RedOnions(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Red Onions (3.75)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.75;
    }
}
