package com.zanxus.javacodegeeks.patterns.adapterpattern.site;

import com.zanxus.javacodegeeks.patterns.adapterpattern.payd.PayD;
import com.zanxus.javacodegeeks.patterns.adapterpattern.xpay.Xpay;

/**
 * @author zanxus
 * @description
 * @create 2016-11-22-下午5:34
 */
public class RunAdapterExample {

    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("1234567898766543");
        xpay.setCustomerName("Max");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("20");
        xpay.setCardCVVNo((short)111);
        xpay.setAmount(2345.11);

        PayD payD = new XpayToPayDAdapter(xpay);

        testPayD(payD);


    }

    private static void testPayD(PayD payD) {
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
