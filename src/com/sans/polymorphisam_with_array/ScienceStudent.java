package com.sans.oop_practice2;

public class ScienceStudent extends Student {

    private int practicalMarks;

    public ScienceStudent(int rollNo, String name,
                          Subject s1, Subject s2, Subject s3,
                          int practicalMarks) {

        super(rollNo, name, s1, s2, s3);
        this.practicalMarks = practicalMarks;
    }

    public int getPracticalMarks() {
        return practicalMarks;
    }

    @Override
    public int calculateTotal() {
        return super.calculateTotal() + practicalMarks;
    }

    @Override
    public double calculatePercentage() {
        return calculateTotal() / 3.5;   // total 350 marks
    }
}

