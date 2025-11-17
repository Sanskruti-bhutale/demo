package com.sans.basic_oop;

public class Bike extends Vehicle {
	boolean helmetIncluded;
	double rent;
	
	

	public Bike(int vehicleNumber, String brand, double rentalPricePerDay, boolean helmetIncluded) {
		super(vehicleNumber, brand, rentalPricePerDay);
		this.helmetIncluded = helmetIncluded;
	}



	@Override
	public void calculateRent(int days) {
		if(helmetIncluded) {
				rent=(double)((rentalPricePerDay*days)+(days*100));
		}else {
			rent=(double)(rentalPricePerDay*days);

	}

}
}