package com.zanxus.javacodegeek.patterns.commandpattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author root
 * @create 2016-12-25 10:26 PM
 */
public class ThreadPool {

    private final BlockingQueue<Job> jobQueue;
    private final Thread[] jobThreads;
    private volatile boolean shutdown;

    public ThreadPool(int n) {
        jobQueue = new LinkedBlockingQueue<>();
        jobThreads = new Thread[n];
        for (int i = 0; i < n; i++) {
            jobThreads[i] = new Worker("Pool Thread " + i);
            jobThreads[i].start();
        }

    }

    public void addJob(Job job) {
        try {
            jobQueue.put(job);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdownPool() {
        while (!jobQueue.isEmpty()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        shutdown = true;
        for (Thread workerThread : jobThreads) {
            workerThread.interrupt();
        }
    }


    public class Worker extends Thread {

        public Worker(String name) {
            super(name);
        }

        public void run() {
            while (!shutdown) {
                try {
                    Job job = jobQueue.take();
                    job.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
