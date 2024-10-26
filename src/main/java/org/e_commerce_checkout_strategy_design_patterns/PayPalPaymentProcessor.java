package org.e_commerce_checkout_strategy_design_patterns;

public class PayPalPaymentProcessor implements PaymentMethodProcessor{
    @Override
    public void checkoutProcessing(double amount) {
        System.out.println("Processing payment of paypal for amount : "+amount);
    }
}
