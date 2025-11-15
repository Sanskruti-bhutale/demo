package com.sans.oop_practice2;

public class Main {
    public static void main(String[] args) {

        Subject m = new Subject("Mathematics", 78);
        Subject e = new Subject("English", 65);
        Subject s = new Subject("Science", 88);

        Student st = new Student(101, "Shivani", m, e, s);

        ResultGenerator rg = new ResultGenerator();
        rg.generateResult(st);

        System.out.println();

        Subject phy = new Subject("Physics", 75);
        Subject chem = new Subject("Chemistry", 62);
        Subject bio = new Subject("Biology", 80);

        ScienceStudent sc = new ScienceStudent(
                102, "Sanskriti", phy, chem, bio, 40);

        rg.generateResult(sc);
    }
}

