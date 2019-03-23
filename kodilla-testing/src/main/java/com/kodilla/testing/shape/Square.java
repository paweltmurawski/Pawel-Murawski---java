package com.kodilla.testing.shape;

public class Square implements Shape {

    private int a;
    int field;

    public Square(int a) {
        this.a = a;
        field = a * a;
    }

    public String getShapeName() {
        return "square";
    }
    public int getField() {
        return field;
    }
}
