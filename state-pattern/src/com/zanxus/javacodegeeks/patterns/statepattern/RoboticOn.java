package com.zanxus.javacodegeeks.patterns.statepattern;

/**
 * @author root
 * @create 2016-12-20 9:54 PM
 */
public class RoboticOn implements RoboticState {

    private final Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
        robot.setRoboticState(robot.getRoboticCook());
    }

    @Override
    public void off() {
        robot.setState(robot.getRoboticOff());
        System.out.println("Robot is switched off");
    }
}
