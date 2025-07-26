package com.course.entities;

public class Parallelogram extends AbstractShape {

    private double base;
    private double height;
    private double side;

    public Parallelogram(Color color, double base, double height, double side) {
        super(color);
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public double perimeter() {
        return 2 * (base * side);
    }

}
