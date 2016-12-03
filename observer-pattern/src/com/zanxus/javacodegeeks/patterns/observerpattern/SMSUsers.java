package com.zanxus.javacodegeeks.patterns.observerpattern;

/**
 * @author root
 * @create 2016-12-03 11:04 PM
 */
public class SMSUsers implements Observer {

    private final Subject subject;
    private String desc;
    private String userInfo;

    public SMSUsers(Subject subject, String userInfo) {
        if (subject==null){
            throw new IllegalArgumentException("No Publisher found");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }

    private void display(){
        System.out.println("["+userInfo+"]: "+desc);
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        display();
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing "+userInfo+" to "+subject.subjectDetails()+" ...");
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed successfully");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing "+userInfo+" to "+subject.subjectDetails()+" ...");
        this.subject.unsubscribeObserver(this);
        System.out.println("Unsubscribed successfully");
    }
}
