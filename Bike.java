package com.sans.oop_practice;

public class Bike extends Vehicle {
	private int engineCapacity;

	public Bike(int engineCapacity,int vehicleId,String brand,double dailyRate) {
		super(vehicleId, brand, dailyRate);
		this.engineCapacity=engineCapacity;
	}
	@Override
	public double calculateRent(int days) {
		double rent;
		if(engineCapacity>150) {
			rent = getDailyRate()*days*1.2;
		}else {
			rent = getDailyRate()*days;
		}
		return rent;
	}

}
