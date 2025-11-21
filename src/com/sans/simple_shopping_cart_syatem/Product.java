package com.sans.simple_shopping_cart_syatem;

abstract class Product {
	int productId;
	String name;
	double price;

	// Non-static variable example
	String brand = "Generic";

	// Constructor
	Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	// Normal method
	void showDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Name      : " + name);
		System.out.println("Price     : " + price);
	}

	// Abstract method
	abstract String getCategory();
}