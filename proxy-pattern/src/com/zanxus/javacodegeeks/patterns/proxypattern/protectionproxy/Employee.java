package com.zanxus.javacodegeeks.patterns.proxypattern.protectionproxy;

/**
 * @author root
 * @create 2016-12-07 11:13 PM
 */
public class Employee implements Staff {

    private ReportGeneratorProxy reportGenerator;

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    @Override
    public boolean isOwner() {
        return false;
    }

    public String generateDailyReport() {
        try {
            return reportGenerator.generateDailyReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
