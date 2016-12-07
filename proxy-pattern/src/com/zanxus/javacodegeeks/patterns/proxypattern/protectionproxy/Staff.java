package com.zanxus.javacodegeeks.patterns.proxypattern.protectionproxy;

/**
 * @author root
 * @create 2016-12-07 11:12 PM
 */
public interface Staff {
    public boolean isOwner();

    public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
