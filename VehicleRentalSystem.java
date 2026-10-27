package com.tka.vehiclerental;

import java.util.ArrayList;

public class VehicleRentalSystem {

    private ArrayList<Vehicle> vehicles;

    public VehicleRentalSystem() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully.");
    }

    public void displayAvailableVehicles() {

        System.out.println("\n====== AVAILABLE VEHICLES ======");

        for (Vehicle vehicle : vehicles) {

            if (vehicle.isAvailable()) {
                vehicle.display();
                System.out.println("-----------------------------");
            }
        }
    }

    public Vehicle findVehicle(int vehicleId) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVehicleId() == vehicleId) {
                return vehicle;
            }
        }

        return null;
    }

    public Rental rentVehicle(Customer customer, int vehicleId, int days) {

        Vehicle vehicle = findVehicle(vehicleId);

        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return null;
        }

        if (!vehicle.isAvailable()) {
            System.out.println("Vehicle is already rented.");
            return null;
        }

        vehicle.setAvailable(false);

        Rental rental = new Rental(customer, vehicle, days);

        System.out.println("Vehicle rented successfully.");

        return rental;
    }

    public void returnVehicle(int vehicleId) {

        Vehicle vehicle = findVehicle(vehicleId);

        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        if (vehicle.isAvailable()) {
            System.out.println("Vehicle is already available.");
            return;
        }

        vehicle.setAvailable(true);

        System.out.println("Vehicle returned successfully.");
    }
}