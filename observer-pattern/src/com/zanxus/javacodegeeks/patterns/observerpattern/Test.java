package com.zanxus.javacodegeeks.patterns.observerpattern;

/**
 * @author root
 * @create 2016-12-04 12:46 AM
 */
public class Test {

    public static void main(String[] args) {
        CommentaryObjectObservable obj = new CommentaryObjectObservable("Soccer Match [2014AUG24]");
        SMSUsersObserver observer = new SMSUsersObserver(obj, "Adam Warner [New York]");
        SMSUsersObserver observer2 = new SMSUsersObserver(obj,"Tim Ronney [London]");
        observer.subscribe();
        observer2.subscribe();
        obj.setDesc("Welcome to live Soccer match");
        obj.setDesc("Current score 0-0");
        observer.unSubscribe();
        obj.setDesc("It’s a goal!!");
        obj.setDesc("Current score 1-0");
    }
}
