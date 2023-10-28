package com.yunusbagriyanik.solid.openclosed.example2.compliant;

public class Female extends Person {
    public Female(double salary, int age, String name) {
        super(salary, age, name);
    }

    @Override
    public double calculateTax() {
        return 0.20 * this.salary;
    }
}
