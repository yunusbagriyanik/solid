package com.yunusbagriyanik.solid.liskovsubstitution.note.model2;

public class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}
