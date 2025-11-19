package com.sans.oop_practice2;

public class Student {

    private int rollNo;
    private String name;

    private Subject s1;
    private Subject s2;
    private Subject s3;

    public Student(int rollNo, String name, Subject s1, Subject s2, Subject s3) {
        this.rollNo = rollNo;
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public Subject getS1() { return s1; }
    public Subject getS2() { return s2; }
    public Subject getS3() { return s3; }

    public int calculateTotal() {
        return s1.getMarks() + s2.getMarks() + s3.getMarks();
    }

    public double calculatePercentage() {
        return (calculateTotal() / 3.0);
    }

    public String getFinalGrade() {
        double p = calculatePercentage();

        if (p >= 90) return "A+";
        else if (p >= 75) return "A";
        else if (p >= 60) return "B";
        else if (p >= 50) return "C";
        else return "Fail";
    }
}

	


