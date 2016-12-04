package com.zanxus.javacodegeeks.patterns.mediatorpattern;

/**
 * @author root
 * @create 2016-12-04 4:01 PM
 */
public class Valve implements Colleague {

    private MachineMediator mediator;

    public void open() {
        System.out.println("Valve is opend...");
        System.out.println("Filling water...");
        mediator.closed();
    }

    public void closed() {
        System.out.println("Valve is closed");
        mediator.on();
    }

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }
}
