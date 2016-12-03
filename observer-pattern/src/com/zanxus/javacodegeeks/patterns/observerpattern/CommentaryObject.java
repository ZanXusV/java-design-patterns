package com.zanxus.javacodegeeks.patterns.observerpattern;

import java.util.List;

/**
 * @author root
 * @create 2016-12-03 10:56 PM
 */
public class CommentaryObject implements Subject,Commentary {
    private final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        observers.stream().forEach(observer -> observer.update(desc));

    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
