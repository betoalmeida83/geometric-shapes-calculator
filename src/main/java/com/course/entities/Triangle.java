package com.course.entities;

public abstract class Triangle extends AbstractShape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Color color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

}
