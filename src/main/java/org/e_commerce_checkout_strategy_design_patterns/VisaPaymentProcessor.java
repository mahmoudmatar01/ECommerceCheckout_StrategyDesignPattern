package org.e_commerce_checkout_strategy_design_patterns;

public class VisaPaymentProcessor implements PaymentMethodProcessor{
    @Override
    public void checkoutProcessing(double amount) {
        System.out.println("Processing payment of visa for amount : "+amount);
    }
}
