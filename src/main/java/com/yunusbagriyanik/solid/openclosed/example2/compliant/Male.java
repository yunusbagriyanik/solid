package com.yunusbagriyanik.solid.openclosed.example2.compliant;

public class Male extends Person {
    public Male(double salary, int age, String name) {
        super(salary, age, name);
    }

    @Override
    double calculateTax() {
        return 0.25 * this.salary;
    }
}
