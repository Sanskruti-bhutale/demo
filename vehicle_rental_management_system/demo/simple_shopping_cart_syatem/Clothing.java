package com.sans.simple_shopping_cart_syatem;


public class Clothing extends Product implements Discountable {

	    String size;

	    // Constructor
	    Clothing(int productId, String name, double price, String size) {
	        super(productId, name, price);
	        this.size = size;
	    }

	    @Override
	    String getCategory() {
	        return "Clothing";
	    }

	    @Override
	    public void applyDiscount(double percent) {
	        price = price - (price * percent / 100);
	    }
	}


