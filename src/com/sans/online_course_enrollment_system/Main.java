package com.sans.online_course_enrollment_system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Predefined course objects
		Course liveCourse = new LiveCourse(101, "Java Fullstack", "3 Months", 15000, "https://live.zoom.com/abc123");

		Course recordedCourse = new RecordedCourse(202, "Data Structures in Java", "40 Hours", 12000,
				"https://drive.google.com/xyz789");

		
		System.out.print("Enter Student Id :: ");
		String id = scanner.nextLine();

		System.out.print("Enter your name :: ");
		String name = scanner.nextLine();

		Student student = new Student(id, name);

		
		System.out.println("Which course you want? (live / recorded) :: ");
		String choice = scanner.nextLine();

		Course selectedCourse = null;

		if (choice.equalsIgnoreCase("live")) {
			selectedCourse = liveCourse;
		} else if (choice.equalsIgnoreCase("recorded")) {
			selectedCourse = recordedCourse;
		} else {
			System.err.println("Invalid choice!");
			return;
		}

		
		System.out.println();
		student.enroll(selectedCourse);

		System.out.println("\n------ COURSE DETAILS ------");
		selectedCourse.getCourseDetails();

		
		System.out.println("------------- COURSE STARTED ------------");
		selectedCourse.startCourse();

		System.out.println();
		student.studentDetails();

		scanner.close();
	}
}
