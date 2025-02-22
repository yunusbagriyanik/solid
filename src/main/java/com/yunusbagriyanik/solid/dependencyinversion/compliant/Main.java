package com.yunusbagriyanik.solid.dependencyinversion.compliant;

public class Main {
    public static void main(String[] args) {
        BlockchainPaymentServiceV2 blockChainPaymentService = new BlockchainPaymentServiceV2(new BitcoinPaymentV2());
        blockChainPaymentService.processPayment(0.1);

        BlockchainPaymentServiceV2 blockchainPaymentService2 = new BlockchainPaymentServiceV2(new EthereumPaymentV2());
        blockchainPaymentService2.processPayment(0.1);
    }
}
