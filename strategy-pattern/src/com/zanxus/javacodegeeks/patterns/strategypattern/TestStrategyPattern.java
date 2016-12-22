package com.zanxus.javacodegeeks.patterns.strategypattern;

/**
 * @author root
 * @create 2016-12-22 10:13 PM
 */
public class TestStrategyPattern {

    public static void main(String[] args) {
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");

        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");

    }
}
