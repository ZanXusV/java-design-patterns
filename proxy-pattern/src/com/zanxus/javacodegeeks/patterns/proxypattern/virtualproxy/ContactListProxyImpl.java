package com.zanxus.javacodegeeks.patterns.proxypattern.virtualproxy;

import java.util.List;

/**
 * @author root
 * @create 2016-12-07 10:56 PM
 */
public class ContactListProxyImpl implements ContactList {


    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList() {
        if (contactList == null) {
            System.out.println("Creating contact list and fetching list of employees...");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }
}
