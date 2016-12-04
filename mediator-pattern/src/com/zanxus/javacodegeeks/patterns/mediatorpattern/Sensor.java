package com.zanxus.javacodegeeks.patterns.mediatorpattern;

/**
 * @author root
 * @create 2016-12-04 4:21 PM
 */
public class Sensor {

    public boolean chectTemperature(int temp) {
        System.out.println("Temperature reached " + temp + " *C");
        return true;
    }
}
