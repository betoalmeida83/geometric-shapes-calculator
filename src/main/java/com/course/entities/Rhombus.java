package com.course.entities;

public class Rhombus extends AbstractShape {

    private double majorDiagonal;
    private double minorDiagonal;
    private double side;

    public Rhombus(Color color, double majorDiagonal, double minorDiagonal, double side) {
        super(color);
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
        this.side = side;
    }

    public double getMajorDiagonal() {
        return majorDiagonal;
    }

    public void setMajorDiagonal(double majorDiagonal) {
        this.majorDiagonal = majorDiagonal;
    }

    public double getMinorDiagonal() {
        return minorDiagonal;
    }

    public void setMinorDiagonal(double minorDiagonal) {
        this.minorDiagonal = minorDiagonal;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (majorDiagonal * minorDiagonal) / 2;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

}
