package com.sans.polymorphisam_with_array;

public class TestMain {
	public void checkupAniaml(Animal animals[]) {
		for(Animal animal:animals) {
			animal.checkup();
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Dog []dogs= {new Dog(),new Dog()};
		Cat cats[]= {new Cat(),new Cat(),new Cat()};
		Bird []birds= {new Bird(),new Bird()};
		TestMain testMain = new TestMain();
		testMain.checkupAniaml(birds);
		testMain.checkupAniaml(cats);
		testMain.checkupAniaml(dogs);

	}

}
