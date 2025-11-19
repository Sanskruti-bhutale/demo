<<<<<<< HEAD
package com.sans.oop_practice2;

public class Main {
    public static void main(String[] args) {

        Subject m = new Subject("Mathematics", 78);
        Subject e = new Subject("English", 65);
        Subject s = new Subject("Science", 88);

        Student st = new Student(101, "Shivani", m, e, s);

        ResultGenerator rg = new ResultGenerator();
        rg.generateResult(st);

        System.out.println();

        Subject phy = new Subject("Physics", 75);
        Subject chem = new Subject("Chemistry", 62);
        Subject bio = new Subject("Biology", 80);

        ScienceStudent sc = new ScienceStudent(
                102, "Sanskriti", phy, chem, bio, 40);

        rg.generateResult(sc);
    }
}

=======
package com.sans.oop_practice;

public class Main{
	public static void main(String args[]) {
	Customer customer = new Customer(101, "Sanskruti", 12345678901l);
	Car car = new Car(true, 101, "BMW", 3000);
	Rental rent = new Rental(customer, car, 3);
	rent.displayRentalSummary();
	Bike bike = new Bike(180, 102, "Hero",1000);
	 rent = new Rental(customer, bike, 4);
	 rent.displayRentalSummary();
	 
	}
	
}
>>>>>>> 07c6e41540452f78cc630f68178088ae29ce461a
