package com.yunusbagriyanik.solid.liskovsubstitution.noncompliant;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class FixedTermDepositAccountV1 extends AccountV1 {
    @Override
    protected void deposit(BigDecimal amount) {
        log.info("Depositing {} to fixed term deposit account", amount);
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Fixed term deposit account does not support withdrawal");
    }
}
