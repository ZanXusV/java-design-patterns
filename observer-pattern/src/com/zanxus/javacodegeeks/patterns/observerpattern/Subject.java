package com.zanxus.javacodegeeks.patterns.observerpattern;
/**
 * @author root
 * @create 2016-12-03 10:44 PM
 */
public interface Subject {

    public void subscribeObserver(Observer observer);

    public void unsubscribeObserver(Observer observer);

    public void notifyObservers();

    public String subjectDetails();

}
