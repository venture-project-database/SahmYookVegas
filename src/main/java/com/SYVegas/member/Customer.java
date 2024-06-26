package com.SYVegas.member;

public class Customer {

    private String customerId;
    private String customerPw;
    private String customerName;
    private String customerPhone;
    private String customerRank;


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPw() {
        return customerPw;
    }

    public void setCustomerPw(String customerPw) {
        this.customerPw = customerPw;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerRank() {
        return customerRank;
    }

    public void setCustomerRank(String customerRank) {
        this.customerRank = customerRank;
    }

    public Customer(String customerId, String customerPw, String customerName, String customerPhone, String customerRank) {
        this.customerId = customerId;
        this.customerPw = customerPw;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerRank = customerRank;
    }
}
