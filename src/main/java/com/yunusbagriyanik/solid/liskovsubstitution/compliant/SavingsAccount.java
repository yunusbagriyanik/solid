package com.yunusbagriyanik.solid.liskovsubstitution.compliant;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class SavingsAccount extends DrawableAccount {
    @Override
    public void deposit(BigDecimal amount) {
        log.info("Depositing {} to savings account", amount);
    }

    @Override
    public void drawMoney(BigDecimal amount) {
        log.info("Withdrawing {} from savings account", amount);
    }
}
