package com.sans.vehicle_rental_management_system;

abstract class Vehicle {
	private String vehicleId;
	private String brand;
	private String model;

	public Vehicle(String vehicleId, String brand, String model) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.model = model;
	}

	// Getters & Setters
	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// Concrete Method
	public void showBasicInfo() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
	}

	// Abstract Method
	public abstract String getType();
}
