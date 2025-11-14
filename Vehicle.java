package com.sans.oop_practice;

public abstract class Vehicle 
{
	private int  vehicleId;
	private String brand;
	private double dailyRate;
	
	public Vehicle(int vehicleId,String brand,double dailyRate){
		this.vehicleId=vehicleId;
		this.brand=brand;
		this.dailyRate=dailyRate;
	}
	public double getDailyRate(){
		return dailyRate;
	}
	abstract double calculateRent(int days);
	
	void displayDetails(){
		System.out.println("Vehicle id :: "+vehicleId);
		System.out.println("Vehicle brand :: "+brand);
		System.out.println("Vehicle daily Rate :: "+dailyRate);
	}
}
