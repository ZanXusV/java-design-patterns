package com.zanxus.javacodegeeks.patterns.builderpattern;

/**
 * @author zanxus
 * @create 2016-12-15-下午7:14
 */
public interface CarBuilder {

    public void buildBodyStyle();
    public void buildPower();
    public void buildEngine();
    public void buildBreaks();
    public void buildSeats();
    public void buildWindows();
    public void buildFuelType();
    public Car getCar();
}
