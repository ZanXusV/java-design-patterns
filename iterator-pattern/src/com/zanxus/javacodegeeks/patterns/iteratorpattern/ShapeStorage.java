package com.zanxus.javacodegeeks.patterns.iteratorpattern;

/**
 * @author root
 * @create 2016-12-28 11:13 PM
 */
public class ShapeStorage {

    private Shape[] shapes = new Shape[5];

    private int index;

    public void addShape(String name) {
        int i = index++;
        shapes[i] = new Shape(i, name);
    }

    public Shape[] getShapes() {
        return shapes;
    }
}
