package com.yunusbagriyanik.solid.openclosed.example1.noncompliant.model;

public record RectangleV1(double length, double height) {

    public double area() {
        return length * height;
    }
}
