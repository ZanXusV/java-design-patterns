package com.zanxus.javacodegeeks.patterns.adapterpattern.xpay;

/**
 * @author zanxus
 * @create 2016-11-22-下午4:54
 */
public interface Xpay {
    public String getCreditCardNo();

    public String getCustomerName();

    public String getCardExpMonth();

    public String getCardExpYear();

    public Short getCardCVVNo();

    public Double getAmount();

    public void setCreditCardNo(String creditCardNo);

    public void setCustomerName(String customerName);

    public void setCardExpMonth(String cardExpMonth);

    public void setCardExpYear(String cardExpYear);

    public void setCardCVVNo(Short cardCVVNo);

    public void setAmount(Double amount);
}
