package com.yunusbagriyanik.solid.dependencyinversion.compliant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BitcoinPaymentV2 implements BlockchainPayment {
    @Override
    public void sendTransaction(double amount) {
        log.info("Bitcoin transaction {} {}", amount, "BTC");
    }
}
