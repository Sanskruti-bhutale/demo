package com.sans.oop;

public class Main {

	public static void main(String[] args) {
		Animal animal[]=new Animal[2];
		animal[0]=new Dog("Broun",3,"Labrador");
		animal[1]=new Cat("kitty", 2, "White");
		for(Animal a:animal) {

			a.showInfo();
			a.makeSound();
			a.eat();
			System.out.println();
			System.out.println();
		}
		
		

	}

}
