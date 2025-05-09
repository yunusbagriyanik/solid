package com.yunusbagriyanik.solid.liskovsubstitution.note.model1.compliant;

// Since User is immutable, the subclass AdminUser cannot change its behavior. Thus, LSP is preserved.
// Immutability supported LSP
public class AdminUser2 extends ImmutableUser {
    public AdminUser2(String name) {
        super(name);
    }
}
