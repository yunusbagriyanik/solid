package com.yunusbagriyanik.solid.liskovsubstitution.note.model3.compliant;

public class SquareCompliant implements Shape {
    int side;

    public SquareCompliant(int side) {
        this.side = side;
    }

    public int area() {
        return side * side;
    }
}
