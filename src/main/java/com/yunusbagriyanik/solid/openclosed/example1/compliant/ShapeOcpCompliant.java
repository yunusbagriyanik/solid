package com.yunusbagriyanik.solid.openclosed.example1.compliant;

import com.yunusbagriyanik.solid.openclosed.example1.compliant.model.Shape;

import java.util.List;

public class ShapeOcpCompliant {
    public double calculateArea(List<Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.area();
        }
        return area;
    }
}
