package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 10:28 PM
 */
public class SingletonLazyMultithreaded {

    private static SingletonLazyMultithreaded sc = null;
    private SingletonLazyMultithreaded(){}
    public static synchronized SingletonLazyMultithreaded getInstance(){
        if (sc==null){
            sc=new SingletonLazyMultithreaded();
        }
        return sc;
    }
}
