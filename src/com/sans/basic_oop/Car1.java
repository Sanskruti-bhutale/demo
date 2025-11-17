package com.sans.basic_oop;

public class Car1 extends Vehicle {
	boolean hasAc;
	public double rent;
	public Car1(int vehicleNumber, String brand, double rentalPricePerDay,boolean hasAc) 
	{
		super(vehicleNumber, brand, rentalPricePerDay);
		this.hasAc=hasAc;
		
	}

	@Override
	public void calculateRent(int days)) {
		if(hasAc) {
			rent=(double)((rentalPricePerDay*days)+(days*500));
		}else {
			rent=(double)(rentalPricePerDay*days);
		}

	}
	

}
