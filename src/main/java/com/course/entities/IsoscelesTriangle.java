package com.course.entities;

public class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(Color color, double sideA, double sideB, double sideC) {
        super(color, sideA, sideB, sideC);
    }

    @Override
    public double area() {
        double height = Math.sqrt(Math.pow(getSideA(), 2) - Math.pow(getSideC() / 2, 2));
        return (getSideC() * height) / 2;
    }

}
