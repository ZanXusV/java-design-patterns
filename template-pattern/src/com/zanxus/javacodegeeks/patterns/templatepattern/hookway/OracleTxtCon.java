package com.zanxus.javacodegeeks.patterns.templatepattern.hookway;

/**
 * @author zanxus
 * @description
 * @create 2016-12-20 下午5:08
 */
public class OracleTxtCon extends ConnectionTemplate {

    @Override
    public void setDBDriver() {
        System.out.println("Setting oracle DB drivers...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for Oracle DB...");
    }

    @Override
    public void setData() {
        System.out.println("Setting up data from txt file...");
    }
}
