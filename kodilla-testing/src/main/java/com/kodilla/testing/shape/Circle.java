package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int pi;
    private int r;
    int field;

    public Circle(int pi, int r) {
        this.pi = pi;
        this.r = r;
        field = pi * r * r;
    }

    public String getShapeName() {
        return "circle";
    }
    public int getField() {
        return field;
    }
}
