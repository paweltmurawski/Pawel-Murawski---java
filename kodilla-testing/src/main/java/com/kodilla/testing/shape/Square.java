package com.kodilla.testing.shape;

public class Square implements Shape {

    private int a;
    private String shapeName;
    int field = a * a;

    public Square(int a, String shapeName) {
        this.a = a;
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }
    public int getField() {
        return field;
    }
}
