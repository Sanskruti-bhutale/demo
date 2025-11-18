package com.sans.simple_shopping_cart_syatem;

public class User {
	int userId;
	String name;
	public User(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	   void showDetails() {
	        System.out.println("User ID: " + userId + ", Name: " + name);
	    }
	}
