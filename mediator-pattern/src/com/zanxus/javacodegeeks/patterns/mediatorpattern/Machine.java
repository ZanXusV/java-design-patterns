package com.zanxus.javacodegeeks.patterns.mediatorpattern;

/**
 * @author root
 * @create 2016-12-04 3:58 PM
 */
public class Machine implements Colleague {
    private MachineMediator mediator;

    public void start() {
        mediator.open();
    }

    public void wash() {
        mediator.wash();
    }

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }
}
