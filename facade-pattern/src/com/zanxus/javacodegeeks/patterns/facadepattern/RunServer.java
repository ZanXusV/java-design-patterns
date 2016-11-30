package com.zanxus.javacodegeeks.patterns.facadepattern;

/**
 * @author zanxus
 * @create 2016-11-30 10:10 PM
 */
public class RunServer {

    public static void main(String[] args) {

        ScheduleServer scheduleServer = new ScheduleServer();

        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();

        System.out.println("Start working......");
        System.out.println("After work done.........");

        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
