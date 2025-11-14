package com.sans.oop_practice;

public class Car extends Vehicle {
	boolean luxuryCar;
	
	public Car(boolean luxaryCar,int vehicleId,String brand,double dailyRate) {
		super(vehicleId, brand, dailyRate);
		this.luxuryCar=luxaryCar;
		//this.rent=rent;
	}
	@Override
	double calculateRent(int days) {
		double rent;
		if(luxuryCar) {
			rent=getDailyRate() * days * 1.5;
			
		}else {
			rent = getDailyRate() * days;
		}
		return rent;
		
	}
}
