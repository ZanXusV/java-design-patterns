package com.zanxus.javacodegeeks.patterns.strategypattern;

/**
 * @author root
 * @create 2016-12-22 10:11 PM
 */
public class LowerTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[LowerTextFormatter]: " + text.toLowerCase());
    }
}
