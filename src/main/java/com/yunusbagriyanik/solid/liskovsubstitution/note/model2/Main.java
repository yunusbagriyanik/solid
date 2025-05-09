package com.yunusbagriyanik.solid.liskovsubstitution.note.model2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Bird sparrow = new Bird();

        // LSP is a prerequisite for OCP. If a subclass can't behave like its superclass, we can't extend the code according to OCP.
        Bird ostrich = new Ostrich(); // LSP violation

        zoo.letBirdFly(sparrow);
        zoo.letBirdFly(ostrich);
    }
}
