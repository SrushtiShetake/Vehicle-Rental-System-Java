package com.tka.vehiclerental;

public class Main {

    public static void main(String[] args) {

        VehicleRentalSystem system = new VehicleRentalSystem();

        // Creating vehicles
        Vehicle car = new Car(101, "Toyota", 2000,true , 5);

        Vehicle bike = new Bike(102, "Honda", 700, true,true);

        Vehicle car2 = new Car(103, "Hyundai", 1800, true, 5);

        // Adding vehicles
        system.addVehicle(car);
        system.addVehicle(bike);
        system.addVehicle(car2);

        // Display available vehicles
        system.displayAvailableVehicles();

        // Creating customer
        Customer customer = new Customer(
                1,
                "Srushti",
                "9876543210"
        );

        // Rent car for 5 days
        Rental rental = system.rentVehicle(
                customer,
                101,
                5
        );

        // Display rental details
        if (rental != null) {
            rental.displayRentalDetails();
        }

        // Display vehicles after renting
        system.displayAvailableVehicles();

        // Return vehicle
        system.returnVehicle(101);

        // Display vehicles again
        system.displayAvailableVehicles();
    }
}