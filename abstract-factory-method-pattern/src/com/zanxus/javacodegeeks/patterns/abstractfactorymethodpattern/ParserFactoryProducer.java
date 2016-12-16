package com.zanxus.javacodegeeks.patterns.abstractfactorymethodpattern;

/**
 * @author root
 * @create 2016-12-16 11:05 PM
 */
public final class ParserFactoryProducer {

    private ParserFactoryProducer() {
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(String factoryType) {

        switch (factoryType) {
            case "NYFactory":
                return new NYParserFactory();
            case "TWFactory":
                return new TWParserFactory();
        }
        return null;
    }

}
