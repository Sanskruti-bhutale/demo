package com.sans.basic_oop;

public class Car {
	double milage;
	public Car() {
		System.out.println("car name is  BMW");
		System.out.println("one of the best car in india");
		System.out.println("fast car good engin");
	
		
			
	}
	public Car(double milage) {
		this();
		this.milage=milage;
		
		System.out.println("milage is "+milage);
		
	}

	public static void main(String[] args) {
		
		Car bmw=new Car(120);
		//System.out.println(bmw);
	}

}
