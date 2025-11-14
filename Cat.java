package com.sans.oop;

public class Cat extends Animal {
	private String color;
	public Cat(String name,int age,String color) {
		super(name, age);
		this.color=color;
	}

	@Override
	public void makeSound() {
		System.out.println("Cat meows: Meow Meow!");

	}

	@Override
	public void eat() {
		System.out.println("Cat eats fish.");
	}
	public String getColor() {
		return color;
	}
	@Override
	public void showInfo() {
		System.out.println("Cat Info: Name: "+getName()+", Age: "+getAge()+", Color: "+getName());
		
	}

}
