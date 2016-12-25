package com.zanxus.javacodegeek.patterns.commandpattern;

/**
 * @author root
 * @create 2016-12-25 10:16 PM
 */
public class EmailJob implements Job {

    private Email email;

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public void run() {
        System.out.println("Job ID: " + Thread.currentThread().getId() + " executing email jobs.");
        if (email != null) {
            email.sendEmail();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
