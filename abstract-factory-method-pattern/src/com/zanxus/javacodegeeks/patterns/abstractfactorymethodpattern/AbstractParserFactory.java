package com.zanxus.javacodegeeks.patterns.abstractfactorymethodpattern;

/**
 * @author root
 * @create 2016-12-16 10:45 PM
 */
public interface AbstractParserFactory {
    public XMLParser getParserInstance(String parserType);
}
