package com.sans.vehicle_rental_management_system;

class Bike extends Vehicle implements Rentable {
	private int engineCC;

	public Bike(String vehicleId, String brand, String model, int engineCC) {
		super(vehicleId, brand, model);
		this.engineCC = engineCC;
	}

	@Override
	public double calculateRent(int days) {
		return days * 500; // Example: ₹500 per day
	}

	@Override
	public void showRentalDetails() {
		System.out.println("---- Bike Rental Details ----");
		showBasicInfo();
		System.out.println("Engine CC: " + engineCC);
	}

	@Override
	public String getType() {
		return "Bike";
	}
}
