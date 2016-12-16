package com.zanxus.javacodegeeks.patterns.abstractfactorymethodpattern;

/**
 * @author root
 * @create 2016-12-16 10:53 PM
 */
public class NYErrorXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("NY Parsing error XML...");
        return "NY Error XML Message";
    }
}
