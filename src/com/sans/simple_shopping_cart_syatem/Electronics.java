package com.sans.simple_shopping_cart_syatem;

class Electronics extends Product implements Discountable {

	int warrantyYears;

	// Constructor
	Electronics(int productId, String name, double price, int warrantyYears) {
		super(productId, name, price);
		this.warrantyYears = warrantyYears;
	}

	// Overriding abstract method
	@Override
	String getCategory() {
		return "Electronics";
	}

	// Overriding interface method
	@Override
	public void applyDiscount(double percent) {
		price = price - (price * percent / 100);
	}
}
