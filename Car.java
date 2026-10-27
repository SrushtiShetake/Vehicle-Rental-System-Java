package com.tka.vehiclerental;

public class Car extends Vehicle {
	
private int numberOfSeats; 
public Car(int vehicleId,String brand, double rentPerday , boolean available ,int numberOfSeats) {
	super(vehicleId ,brand ,rentPerday,available);
	this.numberOfSeats=numberOfSeats;
}
public double calculateRent(int days) {
	double total =getRentPerDay()* days;
	
	if(days>=5) {
		total=total-(total*0.10);
	}
	return total;
}

public void display() {
	super.display();
	System.out.println("Seat : " +numberOfSeats);
	System.out.println("Vehicle Type:car");
}
}
