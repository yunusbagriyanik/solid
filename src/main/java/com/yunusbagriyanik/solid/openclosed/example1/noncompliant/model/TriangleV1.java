package com.yunusbagriyanik.solid.openclosed.example1.noncompliant.model;

public record TriangleV1(double base, double height) {

    public double area() {
        return (base * height) / 2;
    }
}
