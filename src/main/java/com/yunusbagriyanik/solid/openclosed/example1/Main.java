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
        double totalArea1 = shapeNonCompliant.calculateArea(List.of(new RectangleV1(5, 10), new CircleV1(5)));
        double totalArea2 = shapeNonCompliant.calculateArea(List.of(new RectangleV1(5, 10), new RectangleV1(5, 5)));
        log.info("Total Area 1: {}", totalArea1);
        log.info("Total Area 2: {}", totalArea2);

        double totalArea3 = shapeNonCompliant.calculateArea(List.of(new TriangleV1(5, 10)));
        log.info("Total Area 3: {}", totalArea3);

        ShapeOcpCompliant shapeCompliant = new ShapeOcpCompliant();
        double totalArea4 = shapeCompliant.calculateArea(List.of(new Rectangle(5, 10), new Circle(5)));
        log.info("Total Area 4: {}", totalArea4);

        double totalArea5 = shapeCompliant.calculateArea(List.of(new Rectangle(5, 10)));
        log.info("Total Area 5: {}", totalArea5);

        double totalArea6 = shapeCompliant.calculateArea(List.of(new Triangle(5, 10)));
        log.info("Total Area 6: {}", totalArea6);

        double totalArea7 = shapeCompliant.calculateArea(List.of(new Triangle(5, 10), new Rectangle(5, 10)));
        log.info("Total Area 7: {}", totalArea7);
    }
}
