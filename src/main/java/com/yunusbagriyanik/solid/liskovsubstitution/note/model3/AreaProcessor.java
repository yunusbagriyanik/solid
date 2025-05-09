package com.yunusbagriyanik.solid.liskovsubstitution.note.model3;

import com.yunusbagriyanik.solid.liskovsubstitution.note.model3.compliant.RectangleCompliant;
import com.yunusbagriyanik.solid.liskovsubstitution.note.model3.compliant.Shape;
import com.yunusbagriyanik.solid.liskovsubstitution.note.model3.compliant.SquareCompliant;

public class AreaProcessor {
    public static void main(String[] args) {
        // If a function expects a Rectangle (T), but passing a Square (S) breaks its expected behavior,
        // then it violates the Liskov Substitution Principle (LSP),
        // and consequently the Open/Closed Principle (OCP), because the code must be modified to handle it.
        Rectangle r = new Square();
        r.setWidth(5);
        r.setHeight(10);
        System.out.println(r.area()); // 💥 Output: 100 (expected 50)

        Shape s = new SquareCompliant(2);
        System.out.println(s.area());
        Shape rectangle = new RectangleCompliant(5, 10);
        System.out.println(rectangle.area());
    }
}
