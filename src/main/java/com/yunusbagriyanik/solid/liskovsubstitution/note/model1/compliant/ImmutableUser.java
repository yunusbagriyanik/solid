package com.yunusbagriyanik.solid.liskovsubstitution.note.model1.compliant;

public class ImmutableUser {
    private final String name;

    public ImmutableUser(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
