package com.sans.demo;


import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Roll No: ");
		int roll=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter Name: ");
		String name=scanner.nextLine();
		System.out.print("Enter numberr of subjects: ");
		int size=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter marks: ");
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(scanner.nextLine());
			
			
		}
		Student student=new Student(roll, name, a);
		student.showDetails();
		System.out.println("Average: "+student.getAverage());
		
		MarksOperation highstMarksOperation = arr ->{
			int h=arr[0];
			for(int m:arr) {
				if(m>h) {
					h=m;
				}
				
			}
			return h;
		};
		MarksOperation lowestMarksOperation= arr ->{
			int l=arr[0];
			for(int m:arr) {
				if(m<l) {
					l=m;
				}
			}
			return l;
		};
		System.out.println("Highest (via Functional Interface): "+ highstMarksOperation.operate(a));
		System.out.println("Lowest (via Functional Interface): "+lowestMarksOperation.operate(a));;
		
	}

}
