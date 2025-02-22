package com.yunusbagriyanik.solid.dependencyinversion.noncompliant;

public class Main {
    public static void main(String[] args) {
        BitcoinPayment bitcoinPayment = new BitcoinPayment();
        EthPayment ethPayment = new EthPayment();
        BlockchainPaymentService blockchainPaymentService = new BlockchainPaymentService(bitcoinPayment, ethPayment);
        blockchainPaymentService.processPayment("ethereum", 0.1);
        blockchainPaymentService.processPayment("bitcoin", 0.1);
    }
}
