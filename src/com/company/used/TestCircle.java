package com.company.used;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("The circle radius " + c1.getRadius() + " and color is " + c1.getColor() + " and area is " + c1.getArea(c1));

        Circle c2 = new Circle(5.3, "Red");
        System.out.println("The circle radius " + c2.getRadius() + " and color is " + c2.getColor() + " and area is " + c2.getArea(c2));
    }
}
