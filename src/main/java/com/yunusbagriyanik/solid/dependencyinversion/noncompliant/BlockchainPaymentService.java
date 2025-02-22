package com.yunusbagriyanik.solid.dependencyinversion.noncompliant;

public class BlockchainPaymentService {
    private final BitcoinPayment bitcoinPayment;
    private final EthPayment ethPayment;

    public BlockchainPaymentService(BitcoinPayment bitcoinPayment, EthPayment ethPayment) {
        this.bitcoinPayment = bitcoinPayment;
        this.ethPayment = ethPayment;
    }

    public void processPayment(String network, double amount) {
        if (network.equals("ethereum")) {
            ethPayment.transaction(amount);
        } else if (network.equals("bitcoin")) {
            bitcoinPayment.transaction(amount);
        }
    }
}
