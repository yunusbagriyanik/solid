package com.yunusbagriyanik.solid.liskovsubstitution.note.model1;

public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        if (!name.equals("admin")) {
            throw new UnsupportedOperationException("");
        }
        this.name = name;
    }
}
