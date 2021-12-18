package com.company.used;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1.0;
        this.color = "White";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea(Circle c) {
        return 3.141592653589793 * this.radius * this.radius;
    }
}
