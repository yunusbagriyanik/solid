package com.yunusbagriyanik.solid.liskovsubstitution.note.model3.compliant;

public class RectangleCompliant implements Shape {
    int width, height;

    public RectangleCompliant(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int area() {
        return width * height;
    }
}
