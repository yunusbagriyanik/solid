package com.yunusbagriyanik.solid.openclosed.example1.noncompliant;

import com.yunusbagriyanik.solid.openclosed.example1.noncompliant.model.CircleV1;
import com.yunusbagriyanik.solid.openclosed.example1.noncompliant.model.RectangleV1;
import com.yunusbagriyanik.solid.openclosed.example1.noncompliant.model.TriangleV1;

import java.util.List;

public class ShapeNonCompliant {
    @SafeVarargs
    public final double calculateArea(List<Object>... shapes) {
        double area = 0;
        for (List<Object> shapeList : shapes) {
            for (Object shape : shapeList) {
                if (shape instanceof RectangleV1 rect) {
                    area += (rect.length() * rect.height());
                } else if (shape instanceof CircleV1 circle) {
                    area += circle.radius() * circle.radius() * Math.PI;
                } else if (shape instanceof TriangleV1 triangle) {
                    area += (triangle.base() * triangle.height()) / 2;
                } else {
                    throw new RuntimeException("Unsupported Shape");
                }
            }
        }
        return area;
    }
}
