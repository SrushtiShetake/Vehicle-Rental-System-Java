package com.tka.vehiclerental;

public abstract class Vehicle {

	private int vehicleId;
	private String brand;
	private double rentPerday;
	private boolean available;
	
	public Vehicle(int vehicleId, String brand, double rentPerday , boolean available) {
		this.vehicleId=vehicleId;
		this.brand=brand;
		this.rentPerday=rentPerday;
		this.available=true;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	public double getRentPerDay() {
		return rentPerday;
	}
	public abstract double calculateRent(int days);
	
	
	  public void display() {
	        System.out.println("Vehicle ID   : " + vehicleId);
	        System.out.println("Brand        : " + brand);
	        System.out.println("Rent Per Day : ₹" + rentPerday);
	        System.out.println("Available    : " + available);
	    }
	  protected boolean isAvailable() {
		  return available;
		  }
	  
	  protected void setAvailable(boolean b) {
		  available=b;
		  }
	  
}
