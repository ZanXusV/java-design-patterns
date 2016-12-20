package com.zanxus.javacodegeeks.patterns.statepattern;

/**
 * @author root
 * @create 2016-12-20 10:19 PM
 */
public class RoboticStandby implements RoboticState {

    private final Robot robot;

    public RoboticStandby(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("In standby state...");
        robot.setState(robot.getRoboticOn());
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("In standby state...");
        robot.setRoboticState(robot.getRoboticCook());
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        System.out.println("In standby state...");
        robot.setState(robot.getRoboticOff());
        System.out.println("Robot is switched off");
    }
}
