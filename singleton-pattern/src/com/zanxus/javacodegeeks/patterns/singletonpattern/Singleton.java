package com.zanxus.javacodegeeks.patterns.singletonpattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author root
 * @create 2016-12-02 11:11 PM
 */
public class Singleton implements Serializable {

    private static Singleton sc = new Singleton();
    private Singleton(){
        if (sc!=null){
            throw new IllegalStateException("Already created");
        }
    }

    public static Singleton getInstance(){
        return sc;
    }

    private Object readResolve() throws ObjectStreamException{
        return sc;
    }

    private Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, can't be cloned");
    }

    private static Class getClass(String className) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader==null){
            classLoader = Singleton.class.getClassLoader();
        }
        return classLoader.loadClass(className);

    }

}
