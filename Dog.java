package com.sans.oop;

public class Dog extends Animal {
	private String breed;
	
	public Dog(String name,int age,String breed) {
		super(name, age);
		this.breed=breed;
	}
	@Override
	public void makeSound() {
		System.out.println("Dog barks: Woof Woof!");
	}
	@Override
	public void eat() {
		System.out.println("Dog eats dog food.");
		
	}
	public String  getBreed() {
		return breed;
		
	}
	@Override
	public void showInfo() {
		System.out.println("Dog Info: Name: "+getName()+", Age: "+getAge()+", Breed: "+getBreed());
		
	}

}
