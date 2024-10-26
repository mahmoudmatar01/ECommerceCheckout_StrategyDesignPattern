package org.e_commerce_checkout_strategy_design_patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create a new products
        Product wallet = new Product("Wallet", 300, new RegularPriceCalculator());
        Product mobile = new Product("Mobile12", 20000, new GoldPriceCalculator());
        Product mac = new Product("Macbook bro", 45000, new PremiumPriceCalculator());

        // calculate products prices based on membership degree
        double walletPrice = wallet.calculateProductPrice();
        double mobilePrice = mobile.calculateProductPrice();
        double macPrice = mac.calculateProductPrice();

        // start checkout process
        Checkout checkout = new Checkout(new VisaPaymentProcessor());
        Checkout checkout2 = new Checkout(new PayPalPaymentProcessor());
        Checkout checkout3 = new Checkout(new BankTransferPaymentProcessor());

        checkout.checkoutProcessing(walletPrice);
        checkout2.checkoutProcessing(mobilePrice);
        checkout3.checkoutProcessing(macPrice);

    }
}