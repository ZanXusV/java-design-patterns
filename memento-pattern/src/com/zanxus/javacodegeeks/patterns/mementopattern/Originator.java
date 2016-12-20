package com.zanxus.javacodegeeks.patterns.mementopattern;

/**
 * @author zanxus
 * @description
 * @create 2016-12-20-下午2:47
 */
public class Originator {

    private double x;
    private double y;
    private String lastUndoSavepoint;
    CareTaker careTaker;

    public Originator(double x, double y,CareTaker careTaker) {
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;
        createSavePoint("INITIAL");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getLastUndoSavepoint() {
        return lastUndoSavepoint;
    }

    public void setLastUndoSavepoint(String lastUndoSavepoint) {
        this.lastUndoSavepoint = lastUndoSavepoint;
    }

    public void createSavePoint(String savepointName) {
        careTaker.saveMemento(new Memento(this.x,this.y),savepointName);
        lastUndoSavepoint = savepointName;
    }

    public void undo(){
        setOriginatorState(lastUndoSavepoint);
    }

    public void undo(String savepointName){
        setOriginatorState(savepointName);
    }

    public void undoAll(){
        setOriginatorState("INITIAL");
        careTaker.clearSavepoints();
    }

    private void setOriginatorState(String savepointName){
        Memento memento = careTaker.getMemento(savepointName);
        this.x = memento.getX();
        this.y = memento.getY();
    }

    @Override
    public String toString() {
        return "X:" + x + ",Y:" + y;
    }
}
