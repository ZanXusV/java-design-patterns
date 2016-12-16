package com.zanxus.javacodegeeks.patterns.factorymethodpattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-16-上午10:39
 */
public class ErrorXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("Parsing error XML...");
        return "Error XML message";
    }
}
