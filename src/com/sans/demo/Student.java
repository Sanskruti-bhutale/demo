package com.sans.demo;



public class Student {
	int rollNo;
	String name;
	int size;
	int marks[];
	double avg;
	public void showDetails() {
		
		int high=0;
		int low=marks[0];
		System.out.println("----- STUDENT DETAILS -----");
		System.out.println("Roll No: "+rollNo);
		System.out.print("Marks: ");
		
		for(int m:marks)
		{
			System.out.print(m+" ");
			avg+=m;
			if(high<m) {
				high=m;
			}else if(low>m) {
				low=m;
			}
			
		}
		//System.out.println("Average: "+avg/size);
		System.out.println();
		System.out.println("Highest Mark: "+high);
		System.out.println("Lowest Mark: "+low);
	}
	public double getAverage() {
		avg=avg/marks.length;
		return avg;
	}
	public Student(int rollNo, String name, int[] marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	

}
