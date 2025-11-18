package com.sans.oop_practice2;

public class ResultGenerator {

    public void generateResult(Student s) {

        System.out.println("----------------------------");
        System.out.println("        Student Result      ");
        System.out.println("----------------------------");

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name   : " + s.getName());
        System.out.println();

        System.out.println("Subject 1: " + s.getS1().getSubjectName() +
                " - " + s.getS1().getMarks() +
                " marks - Grade: " + s.getS1().getGrade());

        System.out.println("Subject 2: " + s.getS2().getSubjectName() +
                " - " + s.getS2().getMarks() +
                " marks - Grade: " + s.getS2().getGrade());

        System.out.println("Subject 3: " + s.getS3().getSubjectName() +
                " - " + s.getS3().getMarks() +
                " marks - Grade: " + s.getS3().getGrade());

        if (s instanceof ScienceStudent) {
            ScienceStudent sc = (ScienceStudent) s;
            System.out.println("Practical Marks: " +
                    sc.getPracticalMarks() + " / 50");
        }

        System.out.println();

        System.out.println("Total Marks: " + s.calculateTotal());
        System.out.println("Percentage : " + s.calculatePercentage() + "%");
        System.out.println("Overall Grade: " + s.getFinalGrade());
        System.out.println("----------------------------");
    }
}
