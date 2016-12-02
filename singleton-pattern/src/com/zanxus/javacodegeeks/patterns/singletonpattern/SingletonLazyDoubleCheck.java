package com.zanxus.javacodegeeks.patterns.singletonpattern;

/**
 * @author root
 * @create 2016-12-02 10:31 PM
 */
public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck sc = null;
    private SingletonLazyDoubleCheck(){}
    public static SingletonLazyDoubleCheck getInstance(){
        if (sc==null){
            synchronized (SingletonLazyDoubleCheck.class){
                if (sc==null){
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }
}
