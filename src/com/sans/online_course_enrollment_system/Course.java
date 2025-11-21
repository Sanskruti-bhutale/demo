package com.sans.online_course_enrollment_system;

public abstract class Course {
	private int courseId;
	private String courseName;
	private String duration;
	private double price;

	public Course(int courseId, String courseName, String duration, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.price = price;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract void startCourse();

	public abstract void getCourseDetails();

}
