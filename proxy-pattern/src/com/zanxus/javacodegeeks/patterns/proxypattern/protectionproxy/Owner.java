package com.zanxus.javacodegeeks.patterns.proxypattern.protectionproxy;

/**
 * @author root
 * @create 2016-12-07 11:15 PM
 */
public class Owner implements Staff {

    private boolean isOwner = true;
    private ReportGeneratorProxy reportGenerator;


    @Override
    public boolean isOwner() {
        return isOwner;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
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
