package org.e_commerce_checkout_strategy_design_patterns;

public class Checkout {

    public void checkoutProcessing(double amount,PaymentMethod paymentMethod){
        if(paymentMethod == PaymentMethod.PAYPAL)
            System.out.println("Processing payment of paypal for amount : "+amount);

        else if(paymentMethod == PaymentMethod.VISA)
            System.out.println("Processing payment of visa for amount : "+amount);

        else if(paymentMethod == PaymentMethod.BANK_TRANSFER)
            System.out.println("Processing payment of bank transfer for amount : "+amount);

    }
}
