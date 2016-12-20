package com.zanxus.javacodegeeks.patterns.templatepattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-20 下午5:06
 */
public class MySqLCSVCon extends ConnectionTemplate{

    @Override
    public void setDBDriver() {
        System.out.println("Setting MySQL DB drivers...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for MySQL DB...");
    }

    @Override
    public void setData() {
        System.out.println("Setting up data from csv file...");
    }
}
