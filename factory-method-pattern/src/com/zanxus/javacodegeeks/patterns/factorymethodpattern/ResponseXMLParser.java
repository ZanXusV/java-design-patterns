package com.zanxus.javacodegeeks.patterns.factorymethodpattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-16-上午10:43
 */
public class ResponseXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("Parsing response XML...");
        return "Response XML Message";
    }
}
