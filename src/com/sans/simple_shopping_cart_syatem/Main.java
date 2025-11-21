package com.sans.simple_shopping_cart_syatem;

public class Main {
	public static void main(String[] args) {

		// Create user
		User u1 = new User(1, "Shivani");
		u1.showDetails();
		// Create products
		Electronics laptop = new Electronics(101, "HP Laptop", 50000, 2);
		Clothing tshirt = new Clothing(201, "T-Shirt", 500, "M");
		// Create shopping cart
		ShoppingCart cart = new ShoppingCart();

		// Add products normally
		cart.addProduct(laptop);

		// Add with discount (method overloading)
		cart.addProduct(tshirt, 10); // 10% discount

		// Show items
		cart.showCart();

		// Calculate total
		double total = cart.calculateTotal();
		System.out.println("\nTotal Amount = " + total);

		// Show static variable
		System.out.println("Total Shopping Carts Created: " + ShoppingCart.totalCartsCreated);
	}
}