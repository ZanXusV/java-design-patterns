package com.zanxus.javacodegeeks.patterns.mementopattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zanxus
 * @description
 * @create 2016-12-20 下午2:57
 */
public class CareTaker {

    private final Map<String, Memento> savepointStorate = new HashMap<>();

    public void saveMemento(Memento memento,String savepointName) {
        System.out.println("Saving state..."+savepointName);
        savepointStorate.put(savepointName,memento);
    }

    public Memento getMemento(String savepointName) {
        System.out.println("Undo at ..."+savepointName);
        return savepointStorate.get(savepointName);
    }

    public void clearSavepoints(){
        System.out.println("Clearing all save points");
        savepointStorate.clear();
    }

}
