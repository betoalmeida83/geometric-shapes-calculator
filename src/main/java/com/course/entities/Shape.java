package com.course.entities;

public abstract class Shape {

    private Color Color;

    public Shape(Color color) {
        Color = color;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color color) {
        Color = color;
    }

    public abstract double area();
    public abstract double perimeter();

}
