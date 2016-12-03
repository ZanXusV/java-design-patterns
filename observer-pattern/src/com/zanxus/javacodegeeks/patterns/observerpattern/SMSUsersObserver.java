package com.zanxus.javacodegeeks.patterns.observerpattern;

import java.util.*;

/**
 * @author root
 * @create 2016-12-04 12:43 AM
 */
public class SMSUsersObserver implements java.util.Observer{
    private String desc;
    private final String userInfo;
    private final Observable observable;

    public SMSUsersObserver(Observable observable,String userInfo) {
        this.userInfo = userInfo;
        this.observable = observable;
    }

    public void subscribe() {
        System.out.println("Subscribing "+userInfo+" to "+((CommentaryObjectObservable)(observable)).subjectDetails()+" ...");
        this.observable.addObserver(this);
        System.out.println("Subscribed successfully.");
    }
    public void unSubscribe() {
        System.out.println("Unsubscribing "+userInfo+" to "+((CommentaryObjectObservable)(observable)).subjectDetails()+" ...");
        this.observable.deleteObserver(this);
        System.out.println("Unsubscribed successfully.");
    }
    @Override
    public void update(Observable o, Object arg) {
        desc = (String)arg;
        display();
    }
    private void display(){
        System.out.println("["+userInfo+"]: "+desc);
    }
}
