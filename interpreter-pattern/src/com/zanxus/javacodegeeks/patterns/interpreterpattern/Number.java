package com.zanxus.javacodegeeks.patterns.interpreterpattern;

/**
 * @author root
 * @create 2016-12-26 11:14 PM
 */
public class Number implements Expression {

    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}
