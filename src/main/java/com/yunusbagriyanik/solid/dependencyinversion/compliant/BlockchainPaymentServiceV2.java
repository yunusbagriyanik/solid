package com.yunusbagriyanik.solid.dependencyinversion.compliant;

public class BlockchainPaymentServiceV2 {
    private final BlockchainPayment blockchainPayment;

    public BlockchainPaymentServiceV2(BlockchainPayment blockchainPayment) {
        this.blockchainPayment = blockchainPayment;
    }

    public void processPayment(double amount) {
        blockchainPayment.sendTransaction(amount);
    }
}
