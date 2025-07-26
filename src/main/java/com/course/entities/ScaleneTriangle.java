package com.course.entities;

public class ScaleneTriangle extends Triangle{

    public ScaleneTriangle(Color color, double sideA, double sideB, double sideC) {
        super(color, sideA, sideB, sideC);
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

}
