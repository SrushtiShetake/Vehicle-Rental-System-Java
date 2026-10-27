package com.tka.vehiclerental;

public class Bike extends Vehicle {

    private boolean helmetAvailable;

    public Bike(int vehicleId, String brand, double rentPerDay, boolean available, boolean helmetAvailable) {
        super(vehicleId, brand, rentPerDay,available);
        this.helmetAvailable = helmetAvailable;
    }

    @Override
    public double calculateRent(int days) {

        double total = getRentPerDay() * days;

        // ₹50 helmet charge per day
        if (helmetAvailable) {
            total = total + (50 * days);
        }

        return total;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Helmet       : " + helmetAvailable);
        System.out.println("Vehicle Type : Bike");
    }
}
