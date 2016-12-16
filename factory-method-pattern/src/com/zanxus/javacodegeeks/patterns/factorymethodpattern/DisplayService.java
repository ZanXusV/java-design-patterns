package com.zanxus.javacodegeeks.patterns.factorymethodpattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-16-上午10:46
 */
public  abstract class DisplayService {

    public void display(){
        XMLParser parser=getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract XMLParser getParser();
}
