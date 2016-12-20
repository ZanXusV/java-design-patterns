package com.zanxus.javacodegeeks.patterns.templatepattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-20 下午5:32
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
