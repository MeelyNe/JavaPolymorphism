package com.company.used;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Jerry", 15,12,45,1);
        Student student1 = new Student("Carry", 14,12,43,2);
        System.out.println(student.displayStudDetails());
        System.out.println(student1.displayStudDetails());
    }
}
