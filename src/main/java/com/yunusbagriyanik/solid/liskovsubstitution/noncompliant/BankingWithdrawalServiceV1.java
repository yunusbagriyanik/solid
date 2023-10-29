package com.yunusbagriyanik.solid.liskovsubstitution.noncompliant;

import java.math.BigDecimal;

public class BankingWithdrawalServiceV1 {
    private final AccountV1 account;

    public BankingWithdrawalServiceV1(AccountV1 account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
