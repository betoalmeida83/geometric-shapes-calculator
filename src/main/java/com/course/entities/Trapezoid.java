package com.course.entities;

public class Trapezoid extends AbstractShape {

    private double base1;
    private double base2;
    private double height;
    private double side1;
    private double side2;

    public Trapezoid(Color color, double base1, double base2, double height, double side1, double side2) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }


    @Override
    public double area() {
        return ((base1 + base2) * height) / 2;
    }

    @Override
    public double perimeter() {
        return base1 + base2 + side1 + side2;
    }

}
