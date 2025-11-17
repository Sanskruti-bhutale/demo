package sans.com.encapsulation2;

import java.util.Scanner;

public class Person_Main {

	public static void main(String[] args) {
		Person sans=new Person();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your name :: ");
		sans.setName(sc.next());
		System.out.println("name is  :: "+sans.getName());
		
		System.out.print("Enter your age :: ");
		sans.setAge(sc.nextInt());
		System.out.println("Your age is :: "+sans.getAge());

	}

	

}
