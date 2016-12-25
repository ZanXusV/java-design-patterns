package com.zanxus.javacodegeek.patterns.commandpattern;

/**
 * @author root
 * @create 2016-12-25 10:35 PM
 */
public class TestCommandPattern {

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        ThreadPool pool = new ThreadPool(10);
        Email email = null;
        EmailJob emailJob = new EmailJob();

        Sms sms = null;
        SmsJob smsJob = new SmsJob();

        FileIO fileIO = null;
        FileIOJob fileIOJob = new FileIOJob();

        Logging logging = null;
        LoggingJob loggingJob = new LoggingJob();

        for (int i = 0; i < 5; i++) {
            email = new Email();
            emailJob.setEmail(email);

            sms = new Sms();
            smsJob.setSms(sms);

            fileIO = new FileIO();
            fileIOJob.setFileIO(fileIO);

            logging = new Logging();
            loggingJob.setLogging(logging);

            pool.addJob(emailJob);
            pool.addJob(smsJob);
            pool.addJob(fileIOJob);
            pool.addJob(loggingJob);
        }
        pool.shutdownPool();
    }
}
