package com.sans.oop_practice;

public class Main{
	public static void main(String args[]) {
	Customer customer = new Customer(101, "Sanskruti", 12345678901l);
	Car car = new Car(true, 101, "BMW", 3000);
	Rental rent = new Rental(customer, car, 3);
	rent.displayRentalSummary();
	Bike bike = new Bike(180, 102, "Hero",1000);
	 rent = new Rental(customer, bike, 4);
	 rent.displayRentalSummary();
	 
	}
	
}
