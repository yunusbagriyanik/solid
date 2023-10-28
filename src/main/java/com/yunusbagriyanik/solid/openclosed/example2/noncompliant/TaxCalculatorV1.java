package com.yunusbagriyanik.solid.openclosed.example2.noncompliant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TaxCalculatorV1 {
    public double calculateTax(PersonV1 person) {
        double tax = 0;
        switch (person.getGender()) {
            case MALE -> tax = 0.25 * person.getSalary();
            case FEMALE -> tax = 0.20 * person.getSalary();
            case SR_CITIZEN_FEMALE -> tax = 0.17 * person.getSalary();
            default -> {
                log.warn("Unsupported Gender");
                tax = -1;
            }
        }
        return tax;
    }
}
