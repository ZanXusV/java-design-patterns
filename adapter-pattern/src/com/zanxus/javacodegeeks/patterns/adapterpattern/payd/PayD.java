package com.zanxus.javacodegeeks.patterns.adapterpattern.payd;

/**
 * @author zanxus
 * @create 2016-11-22-下午5:14
 */
public interface PayD {
    public String getCustCardNo();

    public void setCustCardNo(String custCardNo);

    public String getCardOwnerName();

    public void setCardOwnerName(String cardOwnerName);

    public String getCardExpMonthDate();

    public void setCardExpMonthDate(String cardExpMonthDate);

    public Integer getCVVNo();

    public void setCVVNo(Integer cVVNo);

    public Double getTotalAmount();

    public void setTotalAmount(Double totalAmount);

}
