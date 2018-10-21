package com.kodilla.testing.shape;

public class Square implements Shape {

    double length;

    public Square(double length) {
        length = length;
    }

    @Override
    public String getShapeName() {
        return "Square";

    }

    @Override
    public double getField() {
        return Math.pow(length, 2);
    }
}