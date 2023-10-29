package com.yunusbagriyanik.solid.liskovsubstitution.compliant;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class FixedTermDepositAccount extends Account {
    @Override
    public void deposit(BigDecimal amount) {
        log.info("Depositing " + amount + " to fixed term deposit account");
    }
}
