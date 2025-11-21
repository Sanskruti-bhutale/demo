package com.sans.vehicle_rental_management_system;

class Customer {
	private String customerId;
	private String name;
	private String phone;

	public Customer(String customerId, String name, String phone) {
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
	}

	public void showCustomerInfo() {
		System.out.println("---- Customer Info ----");
		System.out.println("ID: " + customerId);
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
	}
}
