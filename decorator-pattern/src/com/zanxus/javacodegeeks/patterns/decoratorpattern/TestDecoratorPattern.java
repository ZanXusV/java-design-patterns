package com.zanxus.javacodegeeks.patterns.decoratorpattern;

import java.text.DecimalFormat;

/**
 * @author root
 * @create 2016-12-27 10:32 PM
 */
public class TestDecoratorPattern {

    public static void main(String[] args) {

        DecimalFormat format = new DecimalFormat("#.##");
        Pizza pizza = new SimplyVegPizza();

        pizza = new RomaTomatoes(pizza);
        pizza = new GreenOlives(pizza);
        pizza = new Spinach(pizza);
        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + format.format(pizza.getPrice()));

        pizza = new SimplyNonVegPizza();
        pizza = new Meat(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Ham(pizza);
        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + format.format(pizza.getPrice()));
    }
}
