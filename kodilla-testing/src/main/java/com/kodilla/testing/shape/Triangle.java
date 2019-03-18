package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private int a;
    private int h;
    private String shapeName;
    int field = (a * h) / 2;

    public Triangle(int a, int h, String shapeName) {
        this.a = a;
        this.h = h;
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }
    public int getField () {
        return field;
    }
}
