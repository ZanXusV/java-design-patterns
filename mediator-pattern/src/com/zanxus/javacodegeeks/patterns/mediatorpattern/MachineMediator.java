package com.zanxus.javacodegeeks.patterns.mediatorpattern;

/**
 * @author root
 * @create 2016-12-04 3:48 PM
 */
public interface MachineMediator {
    public void start();

    public void wash();

    public void open();

    public void closed();

    public void on();

    public void off();

    public boolean checkTemperature(int temp);
}
