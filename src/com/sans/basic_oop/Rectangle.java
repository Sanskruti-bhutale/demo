package com.sans.basic_oop;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public String toString() {
		return 2*length*width +"  area of perimeter";
	}
	public static void main(String[] args) {
		
		Rectangle rec=new Rectangle(2,2);
		System.out.println(rec);
	}

}
