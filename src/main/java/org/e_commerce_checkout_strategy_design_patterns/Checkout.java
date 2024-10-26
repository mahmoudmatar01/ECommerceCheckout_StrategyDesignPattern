package org.e_commerce_checkout_strategy_design_patterns;

public class Checkout {

    private PaymentMethodProcessor paymentMethodProcessor;

    // constructor
    public Checkout(PaymentMethodProcessor paymentMethodProcessor) {
        this.paymentMethodProcessor = paymentMethodProcessor;
    }

    // setter and getter methods
    public PaymentMethodProcessor getPaymentMethodProcessor() {
        return paymentMethodProcessor;
    }

    public void setPaymentMethodProcessor(PaymentMethodProcessor paymentMethodProcessor) {
        this.paymentMethodProcessor = paymentMethodProcessor;
    }

    // helper method
    public void checkoutProcessing(double amount){
        paymentMethodProcessor.checkoutProcessing(amount);
    }
}
