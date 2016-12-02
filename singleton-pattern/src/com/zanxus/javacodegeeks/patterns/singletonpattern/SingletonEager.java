package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 9:49 PM
 */
public class SingletonEager {

    private static SingletonEager sc = new SingletonEager();
    private SingletonEager() {}
    public static SingletonEager getInstance(){
        return sc;
    }
}
