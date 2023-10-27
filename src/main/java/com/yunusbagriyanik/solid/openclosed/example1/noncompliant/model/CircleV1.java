package com.yunusbagriyanik.solid.openclosed.example1.noncompliant.model;

public record CircleV1(double radius) {

    public double area() {
        return (radius * radius) * Math.PI;
    }
}
