package com.yunusbagriyanik.solid.openclosed.example2.compliant;

import lombok.Data;

@Data
public abstract class Person {
    protected double salary;
    protected int age;
    protected String name;

    protected Person(double salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    abstract double calculateTax();
}
