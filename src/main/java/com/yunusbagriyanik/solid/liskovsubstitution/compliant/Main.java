package com.yunusbagriyanik.solid.liskovsubstitution.compliant;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account fixedTermDepositAccount = new FixedTermDepositAccount();
        fixedTermDepositAccount.deposit(new BigDecimal("1000.00"));

        DrawableAccount drawableAccount = new SavingsAccount();
        BankingWithdrawalService ws2 = new BankingWithdrawalService(drawableAccount);
        ws2.withdraw(new BigDecimal("100.00"));
        ws2.deposit(new BigDecimal("100.00"));
    }
}
