package com.zanxus.javacodegeeks.patterns.proxypattern.protectionproxy;

import com.zanxus.javacodegeeks.patterns.proxypattern.remoteproxy.ReportGenerator;

import java.rmi.Naming;

/**
 * @author root
 * @create 2016-12-07 11:19 PM
 */
public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {
    ReportGenerator reportGenerator;
    Staff staff;

    public ReportGeneratorProtectionProxy(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        if (staff.isOwner()) {
            try {
                ReportGenerator reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
                return reportGenerator.generateDailyReport();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        } else {
            return "Not Authorized to view report.";
        }
    }
}
