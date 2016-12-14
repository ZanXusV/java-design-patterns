package com.zanxus.javacodegeeks.patterns.flyweightpattern;

/**
 * @author root
 * @create 2016-12-14 9:14 PM
 */
public class JavaPlatform implements Platform {


    public JavaPlatform() {
        System.out.println("JavaPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java code");
    }
}
