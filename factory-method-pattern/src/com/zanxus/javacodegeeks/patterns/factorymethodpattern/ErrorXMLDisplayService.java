package com.zanxus.javacodegeeks.patterns.factorymethodpattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-16-上午10:49
 */
public class ErrorXMLDisplayService extends DisplayService {

    @Override
    protected XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
