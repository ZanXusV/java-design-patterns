package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 10:21 PM
 */
public class SingletonLazy {

    private static SingletonLazy sc = null;
    private SingletonLazy(){}
    public static SingletonLazy getInstance(){
        if (sc==null){
            sc=new SingletonLazy();
        }
        return sc;
    }
}
