package com.yunusbagriyanik.solid.liskovsubstitution.noncompliant;

import java.math.BigDecimal;

public abstract class AccountV1 {
    protected abstract void deposit(BigDecimal amount);

    protected abstract void withdraw(BigDecimal amount);
}
