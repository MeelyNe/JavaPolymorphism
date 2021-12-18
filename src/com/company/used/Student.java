package com.company.used;

public class Student {

    private String studName;
    private double mark1;
    private double mark2;
    private double mark3;
    private double totalMarks;
    private int rollNum;

    public Student(String studName, double mark1, double mark2, double mark3, int rollNum) {
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.rollNum = rollNum;
    }

    public double calculateTotal() {
        totalMarks = mark1 + mark2 + mark3;
        return totalMarks;
    }

    public String displayStudDetails() {
        calculateTotal();
        return "Student{" +
                "studName='" + studName + '\'' +
                ", mark1=" + mark1 +
                ", mark2=" + mark2 +
                ", mark3=" + mark3 +
                ", totalMarks=" + totalMarks +
                ", rollNum=" + rollNum +
                '}';
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }
}
