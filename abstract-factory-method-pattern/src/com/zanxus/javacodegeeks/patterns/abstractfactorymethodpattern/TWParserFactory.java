package com.zanxus.javacodegeeks.patterns.abstractfactorymethodpattern;

/**
 * @author root
 * @create 2016-12-16 10:52 PM
 */
public class TWParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {

        switch (parserType) {
            case "TWERROR":
                return new TWErrorXMLParser();
            case "TWFEEDBACK":
                return new TWFeedbackXMLParser();
            case "TWORDER":
                return new TWOrderXMLParser();
            case "TWRESPONSE":
                return new TWResponseXMLParser();
        }
        return null;
    }
}
