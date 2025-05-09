package com.yunusbagriyanik.solid.liskovsubstitution.note.model2.compliant;

public class Sparrow implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
