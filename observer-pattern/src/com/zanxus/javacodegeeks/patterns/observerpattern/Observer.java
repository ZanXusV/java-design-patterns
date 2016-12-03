package com.zanxus.javacodegeeks.patterns.observerpattern;

/**
 * @author root
 * @create 2016-12-03 10:48 PM
 */
public interface Observer {

    public void update(String desc);

    public void subscribe();

    public void unSubscribe();

}
