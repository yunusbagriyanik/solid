package com.yunusbagriyanik.solid.openclosed.example2;

import com.yunusbagriyanik.solid.openclosed.example2.compliant.*;
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

        log.info("-------------------");
        TaxCalculator taxCalculatorCompliant = new TaxCalculator();
        Person personI = new Female(100000, 39, "Person I");
        Person personII = new SrCitizenFemale(300000, 30, "Person II");
        Person personIII = new Male(100000, 30, "Person III");
        log.info("Tax for Test I: {}", taxCalculatorCompliant.calculateTax(personI));
        log.info("Tax for Test II: {}", taxCalculatorCompliant.calculateTax(personII));
        log.info("Tax for Test III: {}", taxCalculatorCompliant.calculateTax(personIII));
    }
}
