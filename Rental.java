package com.tka.vehiclerental;

public class Rental {

    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private double totalAmount;

    public Rental(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.totalAmount = vehicle.calculateRent(days);
    }

    public void displayRentalDetails() {

        System.out.println("\n========== RENTAL DETAILS ==========");

        customer.display();

        System.out.println("------------------------------------");

        vehicle.display();

        System.out.println("Rental Days  : " + days);
        System.out.println("Total Amount : ₹" + totalAmount);

        System.out.println("====================================");
    }
}