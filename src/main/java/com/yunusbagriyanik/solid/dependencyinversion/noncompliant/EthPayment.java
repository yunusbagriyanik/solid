package com.yunusbagriyanik.solid.dependencyinversion.noncompliant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EthPayment {
    public void transaction(double amount) {
        log.info("Ethereum transaction {} {}", amount, "ETH");
    }
}
