package com.zanxus.javacodegeeks.patterns.proxypattern.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author root
 * @create 2016-12-06 9:28 PM
 */
public interface ReportGenerator extends Remote {

    public String generateDailyReport() throws RemoteException;

}
