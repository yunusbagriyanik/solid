package com.yunusbagriyanik.solid.dependencyinversion.noncompliant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BitcoinPayment {
    public void transaction(double amount) {
        log.info("Bitcoin transaction {} {}", amount, "BTC");
    }
}
