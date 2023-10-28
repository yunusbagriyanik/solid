package com.yunusbagriyanik.solid.openclosed.example2;

import com.yunusbagriyanik.solid.openclosed.example2.noncompliant.Gender;
import com.yunusbagriyanik.solid.openclosed.example2.noncompliant.PersonV1;
import com.yunusbagriyanik.solid.openclosed.example2.noncompliant.TaxCalculatorV1;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        TaxCalculatorV1 taxCalculator = new TaxCalculatorV1();
        log.info("Tax for Test I: {}", taxCalculator.calculateTax(PersonV1.builder()
                .salary(100000)
                .age(30)
                .name("Test I")
                .gender(Gender.MALE)
                .build()));
        log.info("Tax for Test II: {}", taxCalculator.calculateTax(PersonV1.builder()
                .salary(200000)
                .age(30)
                .name("Test II")
                .gender(Gender.FEMALE)
                .build()));
        log.info("Tax for Test III: {}", taxCalculator.calculateTax(PersonV1.builder()
                .salary(300000)
                .age(30)
                .name("Test III")
                .gender(Gender.SR_CITIZEN_FEMALE)
                .build()));
    }
}
