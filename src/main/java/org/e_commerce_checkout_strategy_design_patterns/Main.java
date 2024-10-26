package org.e_commerce_checkout_strategy_design_patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create a new products
        Product wallet = new Product("Wallet", 300);
        Product mobile = new Product("Mobile12", 20000);
        Product mac = new Product("Macbook bro", 45000);

        // calculate products prices based on membership degree
        double walletPrice = wallet.calculateProductPrice(MembershipType.REGULAR);
        double mobilePrice = mobile.calculateProductPrice(MembershipType.GOLD);
        double macPrice = mac.calculateProductPrice(MembershipType.PREMIUM);

        // start checkout process
        Checkout checkout = new Checkout();
        checkout.checkoutProcessing(walletPrice,PaymentMethod.VISA);
        checkout.checkoutProcessing(mobilePrice,PaymentMethod.PAYPAL);
        checkout.checkoutProcessing(macPrice,PaymentMethod.BANK_TRANSFER);

    }
}