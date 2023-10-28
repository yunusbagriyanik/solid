package com.yunusbagriyanik.solid.openclosed.example2.noncompliant;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonV1 {
    private Gender gender;
    private double salary;
    private int age;
    private String name;
}
