package com.tka.vehiclerental;

public class Customer {

    private int customerId;
    private String name;
    private String mobile;

    public Customer(int customerId, String name, String mobile) {
        this.customerId = customerId;
        this.name = name;
        this.mobile = mobile;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public void display() {
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
        System.out.println("Mobile      : " + mobile);
    }
}