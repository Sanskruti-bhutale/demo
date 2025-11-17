package com.sans.basic_oop;

public class Book {
	String title;
	String author;
	int price;
	public Book(String title, String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Name of the book is :: "+this.title);
		System.out.println("author of the book is :: "+this.author);
		System.out.println("price of the book is :: "+this.price);
		
		
	}

	public static void main(String[] args) {
		Book a=new Book("Atomic habbit","James gosling",1000);
		a.displayDetails();

	}

}
