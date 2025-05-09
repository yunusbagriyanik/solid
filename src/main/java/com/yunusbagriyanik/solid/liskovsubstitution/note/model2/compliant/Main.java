package com.yunusbagriyanik.solid.liskovsubstitution.note.model2.compliant;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        FlyingBird sparrow = new Sparrow();
        zoo.letFly(sparrow);
    }
}
