package com.zanxus.javacodegeeks.patterns.factorymethodpattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-16-上午10:42
 */
public class OrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing order XML...");
        return "Order XML Message";
    }
}
