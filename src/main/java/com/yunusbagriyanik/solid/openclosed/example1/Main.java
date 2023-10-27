package com.yunusbagriyanik.solid.openclosed.example1;

import com.yunusbagriyanik.solid.openclosed.example1.compliant.ShapeOcpCompliant;
import com.yunusbagriyanik.solid.openclosed.example1.compliant.model.Circle;
import com.yunusbagriyanik.solid.openclosed.example1.compliant.model.Rectangle;
import com.yunusbagriyanik.solid.openclosed.example1.compliant.model.Triangle;
import com.yunusbagriyanik.solid.openclosed.example1.noncompliant.ShapeNonCompliant;
import com.yunusbagriyanik.solid.openclosed.example1.noncompliant.model.CircleV1;
import com.yunusbagriyanik.solid.openclosed.example1.noncompliant.model.RectangleV1;
import com.yunusbagriyanik.solid.openclosed.example1.noncompliant.model.TriangleV1;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ShapeNonCompliant shapeNonCompliant = new ShapeNonCompliant();
        double v1 = shapeNonCompliant.calculateArea(List.of(new RectangleV1(5, 10), new CircleV1(5)));
        double v2 = shapeNonCompliant.calculateArea(List.of(new RectangleV1(5, 10), new RectangleV1(5, 5)));
        log.info("V1: {}", v1);
        log.info("V2: {}", v2);

        double v3 = shapeNonCompliant.calculateArea(List.of(new TriangleV1(5, 10)));
        log.info("V3: {}", v3);

        ShapeOcpCompliant shapeCompliant = new ShapeOcpCompliant();
        double v4 = shapeCompliant.calculateArea(List.of(new Rectangle(5, 10), new Circle(5)));
        log.info("V4: {}", v4);

        double v5 = shapeCompliant.calculateArea(List.of(new Rectangle(5, 10)));
        log.info("V5: {}", v5);

        double v6 = shapeCompliant.calculateArea(List.of(new Triangle(5, 10)));
        log.info("V6: {}", v6);
    }
}
