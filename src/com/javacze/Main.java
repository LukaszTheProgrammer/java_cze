package com.javacze;

import com.javacze.shapes.Circle;
import com.javacze.shapes.Point;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(3,4);
        Circle c = new Circle(p);

        System.out.println(c.getCenter());

    }
}

