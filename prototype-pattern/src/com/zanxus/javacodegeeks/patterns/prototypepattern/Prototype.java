package com.zanxus.javacodegeeks.patterns.prototypepattern;

/**
 * @author root
 * @create 2016-12-19 11:15 PM
 */
public interface Prototype extends Cloneable {

    public AccessControl clone() throws CloneNotSupportedException;

}
