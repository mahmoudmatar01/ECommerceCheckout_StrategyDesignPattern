package org.e_commerce_checkout_strategy_design_patterns;

public class Product {

    private String productName;
    private double productPrice;
    private MembershipPriceCalculator membershipPriceCalculator;

    // all arguments constructor
    public Product(String productName, double productPrice, MembershipPriceCalculator membershipPriceCalculator) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.membershipPriceCalculator = membershipPriceCalculator;
    }

    // setter and getter methods
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public MembershipPriceCalculator getMembershipPriceCalculator() {
        return membershipPriceCalculator;
    }

    public void setMembershipPriceCalculator(MembershipPriceCalculator membershipPriceCalculator) {
        this.membershipPriceCalculator = membershipPriceCalculator;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    // helper method
    public double calculateProductPrice() {
        return membershipPriceCalculator.calculateProductPrice(productPrice);
    }
}
