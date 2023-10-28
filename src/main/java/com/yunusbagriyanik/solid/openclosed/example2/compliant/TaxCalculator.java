package com.yunusbagriyanik.solid.openclosed.example2.compliant;

public class TaxCalculator {
    public double calculateTax(Person person) {
        return person.calculateTax();
    }
}
