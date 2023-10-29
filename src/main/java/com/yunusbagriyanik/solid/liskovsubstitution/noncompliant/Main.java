package com.yunusbagriyanik.solid.liskovsubstitution.noncompliant;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        AccountV1 fixedTermDepositAccount = new FixedTermDepositAccountV1();
        fixedTermDepositAccount.deposit(new BigDecimal("1000.00"));

        BankingWithdrawalServiceV1 ws = new BankingWithdrawalServiceV1(fixedTermDepositAccount);
        ws.withdraw(new BigDecimal("100.00"));
    }
}
