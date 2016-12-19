package com.zanxus.javacodegeeks.patterns.prototypepattern;

/**
 * @author root
 * @create 2016-12-19 11:16 PM
 */
public class AccessControl implements Prototype {

    private final String controlLevel;
    private String access;

    public AccessControl(String controlLevel, String access) {
        this.controlLevel = controlLevel;
        this.access = access;
    }

    @Override
    public AccessControl clone() throws CloneNotSupportedException {
        try {
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getControlLevel() {
        return controlLevel;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
