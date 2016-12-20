package com.zanxus.javacodegeeks.patterns.templatepattern.hookway;

/**
 * @author zanxus
 * @description
 * @create 2016-12-20 下午5:55
 */
public class TestTemplatePattern {

    public static void main(String[] args) {
        System.out.println("For MySQL...");
        ConnectionTemplate template = new MySqLCSVCon();
        template.run();
        System.out.println();
        System.out.println("For Oracle...");
        template = new OracleTxtCon();
        template.run();
    }
}
