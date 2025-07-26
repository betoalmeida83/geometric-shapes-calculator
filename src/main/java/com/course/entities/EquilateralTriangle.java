package com.course.entities;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(Color color, double sideA, double sideB, double sideC) {
        super(color, sideA, sideB, sideC);
    }

    public double area() {
        return (Math.pow(getSideA(), 2) * Math.sqrt(3)) / 4;
    }

}
