package com.zanxus.javacodegeeks.patterns.mementopattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-20 下午2:54
 */
public class Memento {
    private double x;
    private double y;

    public Memento(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
