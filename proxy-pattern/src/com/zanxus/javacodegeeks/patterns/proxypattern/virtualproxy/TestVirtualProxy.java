package com.zanxus.javacodegeeks.patterns.proxypattern.virtualproxy;

import java.util.List;

/**
 * @author root
 * @create 2016-12-07 10:59 PM
 */
public class TestVirtualProxy {

    public static void main(String[] args) {
        ContactList contactList = new ContactListProxyImpl();
        Company company = new Company("ABC Company", "China", "+86-010-12345678", contactList);
        System.out.println("Company Name:" + company.getCompanyName());
        System.out.println("Company Address:" + company.getCompanyAddress());
        System.out.println("Company Contact No:" + company.getCompanyContactNo());
        System.out.println("Requesting for contact list");

        contactList = company.getContactList();

        List<Employee> employeeList = contactList.getEmployeeList();
        employeeList.stream().forEach(employee -> System.out.println(employee));

    }
}
