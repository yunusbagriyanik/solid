package com.yunusbagriyanik.solid.liskovsubstitution.compliant;

import java.math.BigDecimal;

public class BankingWithdrawalService {
    private final DrawableAccount drawableAccount;

    public BankingWithdrawalService(DrawableAccount drawableAccount) {
        this.drawableAccount = drawableAccount;
    }

    public void withdraw(BigDecimal amount) {
        drawableAccount.drawMoney(amount);
    }

    public void deposit(BigDecimal amount) {
        drawableAccount.deposit(amount);
    }
}
