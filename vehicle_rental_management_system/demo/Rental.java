package com.sans.oop_practice;

public class Rental {
	Customer customer;
	Vehicle vehicle;
	int days;
	public Rental(Customer customer,Vehicle vehicle,int days) {
		this.customer = customer;
		this.vehicle = vehicle;
		this.days = days;
		
	}
	public void displayRentalSummary() {
		System.out.println("...............Customer Information...............");
		
		customer.displayCustomerInformation();
		System.out.println();
		System.out.println("...............Vehicle Information................");
		System.out.println();
		vehicle.displayDetails();
		System.out.println();
		System.out.println("................Total Rent........................");
		System.out.println();
		System.out.println("Vehicle total Rent :: "+vehicle.calculateRent(days));
	}

}
