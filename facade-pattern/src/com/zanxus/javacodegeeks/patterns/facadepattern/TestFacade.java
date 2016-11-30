package com.zanxus.javacodegeeks.patterns.facadepattern;

/**
 * @author zanxus
 * @create 2016-11-30 10:13 PM
 */
public class TestFacade {

    public static void main(String[] args) {

        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
        facadeServer.startServer();

        System.out.println("Start working......");
        System.out.println("After work done.........");

        facadeServer.stopServer();
    }
}
