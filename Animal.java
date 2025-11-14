package com.sans.oop;

public abstract class Animal {
	private String name;
	private int age;
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public abstract void makeSound();
	public abstract void eat();
	public void showInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	

}
