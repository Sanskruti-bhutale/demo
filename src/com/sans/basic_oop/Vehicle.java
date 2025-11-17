package com.sans.basic_oop;

public abstract class Vehicle {
	int vehicleNumber;
	 String brand ;
	 double rentalPricePerDay;
	
	public Vehicle(int vehicleNumber,String brand,double rentalPricePerDay) {
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.rentalPricePerDay=rentalPricePerDay;
	}
	public abstract void calculateRent(int days);
	public void displayDetails() {
		System.out.println("         YOUR VEHICLE INFORMATION       ");
		System.out.println("Vehicle number is :: "+vehicleNumber);
		System.out.println("Vehicle Brand is :: "+brand);
		System.out.println("Rental Price Per Day :: "+rentalPricePerDay);
	}
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}
	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}
	
}
