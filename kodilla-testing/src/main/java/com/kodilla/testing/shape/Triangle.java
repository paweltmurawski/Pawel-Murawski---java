package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private int a;
    private int h;
    int field;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
        field = (a * h) / 2;
    }

    public String getShapeName() {
        return "triangle";
    }
    public int getField () {
        return field;
    }
}
