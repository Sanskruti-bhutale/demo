package com.sans.basic_oop;

public class Student {
	String name;
	int age;
	char grade;
	public Student(String name,int age,char grade) {
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	@Override
	public String toString() {
		return "name of  the student is ::"+name+ "\nage of the student is ::"+age+ "\ngrade ::"+grade	;		
	}
		  
	

}
