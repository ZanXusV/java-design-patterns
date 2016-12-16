package com.zanxus.javacodegeeks.patterns.abstractfactorymethodpattern;

/**
 * @author root
 * @create 2016-12-16 10:56 PM
 */
public class NYResponseXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("NY Parsing response XML...");
        return "NY Response XML Message";
    }

}
