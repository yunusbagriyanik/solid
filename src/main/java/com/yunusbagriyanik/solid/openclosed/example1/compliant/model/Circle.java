package com.yunusbagriyanik.solid.openclosed.example1.compliant.model;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (radius * radius) * Math.PI;
    }
}
