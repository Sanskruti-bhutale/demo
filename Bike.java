package com.sans.oop_practice;



public class Bike extends Vehicle {
	private int engineCapacity;
	
	double rent;
	public Bike(int engineCapacity,int vehicleId,String brand,double dailyRate) {
		super(vehicleId, brand, dailyRate);
		this.engineCapacity=engineCapacity;
		//this.rent=rent;
	}
	@Override
	public double calculateRent(int days) {
		if(engineCapacity>150) {
			rent = getDailyRate()*days*1.2;
		}else {
			rent = getDailyRate()*days;
		}
		return rent;
	}

}
