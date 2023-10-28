package com.yunusbagriyanik.solid.openclosed.example2.compliant;

public class SrCitizenFemale extends Person {
    public SrCitizenFemale(double salary, int age, String name) {
        super(salary, age, name);
    }

    @Override
    double calculateTax() {
        return 0.17 * this.salary;
    }
}
