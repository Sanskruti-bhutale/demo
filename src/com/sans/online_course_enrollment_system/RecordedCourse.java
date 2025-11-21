package com.sans.online_course_enrollment_system;

public class RecordedCourse extends Course {
	private String videoDriveLink;

	public RecordedCourse(int courseId, String courseNameString, String duration, double price, String videoDriveLink) {
		super(courseId, courseNameString, duration, price);
		this.videoDriveLink = videoDriveLink;
	}

	@Override
	public void startCourse() {
		System.out.println("Starting Course: " + getCourseName());
		System.out.println("Watching recorded videos... Access: " + videoDriveLink);

	}
	
	public String getVideoDriveLink() {
		return videoDriveLink;
	}

	public void setVideoDriveLink(String videoDriveLink) {
		this.videoDriveLink = videoDriveLink;
	}

	public void getCourseDetails() {
		System.out.println();

		System.out.println("--- COURSE DETAILS ---");
		System.out.println(" Course Id :: " + getCourseId());
		System.out.println(" Course Name :: " + getCourseName());
		System.out.println(" The Course Price :: " + getPrice());
		System.out.println(" Course duration :: " + getDuration());
		System.out.println("Type: Recorded Course");
		System.out.println("Session Link: " + videoDriveLink);
		System.out.println();

	}

}
