package com.sans.online_course_enrollment_system;

public class LiveCourse extends Course {
	private String liveSessionLink;

	public LiveCourse(int courseId, String courseName, String duration, double price, String liveSessionLink) {
		super(courseId, courseName, duration, price);
		this.liveSessionLink = liveSessionLink;
	}

	@Override
	public void startCourse() {
		System.out.println("Starting Course: " + getCourseName());
		System.out.println("Live class started... Join using: " + liveSessionLink);

	}
	

	public String getLiveSessionLink() {
		return liveSessionLink;
	}

	public void setLiveSessionLink(String liveSessionLink) {
		this.liveSessionLink = liveSessionLink;
	}

	@Override
	public void getCourseDetails() {

		System.out.println("--- COURSE DETAILS ---");
		System.out.println(" Course Id :: " + getCourseId() );
		System.out.println(" Course Name :: " + getCourseName() );
		System.out.println(" Course duration :: " + getDuration());
		System.out.println(" The Course Price :: " + getPrice());
		System.out.println(" Type: Live Course");
		System.out.println(" Session Link: " + liveSessionLink);
		System.out.println();

	}

}
