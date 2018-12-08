package com.javacze.shapes;

public class Circle {
    private Point center;
    char c;

    public char getC() {
        return c;
    }

    public Circle() {
    }

    public Circle(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }
}
