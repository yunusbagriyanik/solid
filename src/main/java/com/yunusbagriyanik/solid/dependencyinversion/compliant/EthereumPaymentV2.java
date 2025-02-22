package com.yunusbagriyanik.solid.dependencyinversion.compliant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EthereumPaymentV2 implements BlockchainPayment {
    @Override
    public void sendTransaction(double amount) {
        log.info("Ethereum transaction {} {}", amount, "ETH");
    }
}
