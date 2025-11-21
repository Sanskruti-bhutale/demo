package com.sans.online_course_enrollment_system;

public class Student {
	private String studentId;
	private String name;

	public Student(String studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}

	public void studentDetails() {
		
		System.out.println("------Student Details---------");
		System.out.println();
		System.out.println("Student ID: " + studentId);
		System.out.println("Name: " + name);
	}

	public void enroll(Course c) {
		System.out.println("Enrolling in course: " + c.getCourseName());
		System.out.println("Enrollment Successful!");

	}

}
