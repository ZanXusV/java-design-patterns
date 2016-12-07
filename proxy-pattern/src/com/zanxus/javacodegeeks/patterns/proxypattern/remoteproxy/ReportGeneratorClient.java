package com.zanxus.javacodegeeks.patterns.proxypattern.remoteproxy;

import java.rmi.Naming;

/**
 * @author root
 * @create 2016-12-07 9:50 PM
 */
public class ReportGeneratorClient {

    public static void main(String[] args) {
        new ReportGeneratorClient().generateReport();
    }

    public void generateReport() {
        try {
            ReportGenerator reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
            System.out.println(reportGenerator.generateDailyReport());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
