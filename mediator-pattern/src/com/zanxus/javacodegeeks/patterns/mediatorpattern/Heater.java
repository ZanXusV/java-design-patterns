package com.zanxus.javacodegeeks.patterns.mediatorpattern;

/**
 * @author root
 * @create 2016-12-04 4:04 PM
 */
public class Heater implements Colleague {

    private MachineMediator mediator;

    public void on(int temp) {
        System.out.println("Heater is on...");
        if (mediator.checkTemperature(temp)) {
            System.out.println("Temperature is set to " + temp);
            mediator.off();
        }
    }

    public void off() {
        System.out.println("Heater is off...");
        mediator.wash();
    }

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }
}
