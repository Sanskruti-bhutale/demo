<<<<<<< HEAD
package com.sans.oop_practice;

public class Main{
	public static void main(String args[]) {
	Customer customer = new Customer(101, "Sanskruti", 12345678901l);
	Car car = new Car(true, 101, "BMW", 3000);
	Rental rent = new Rental(customer, car, 3);
	rent.displayRentalSummary();
	Bike bike = new Bike(180, 102, "Hero",1000);
	 rent = new Rental(customer, bike, 3);
	 rent.displayRentalSummary();
	 
	}
	
=======
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

>>>>>>> d5af780 (Initial commit)
}
