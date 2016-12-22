package com.zanxus.javacodegeeks.patterns.strategypattern;

/**
 * @author root
 * @create 2016-12-22 10:09 PM
 */
public class CapTextFormatter implements TextFormatter {

    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]:" + text.toUpperCase());
    }
}
