package com.zanxus.javacodegeeks.patterns.abstractfactorymethodpattern;

/**
 * @author root
 * @create 2016-12-16 10:57 PM
 */
public class TWErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("TW Parsing error XML...");
        return "TW Error XML Message";
    }
}
