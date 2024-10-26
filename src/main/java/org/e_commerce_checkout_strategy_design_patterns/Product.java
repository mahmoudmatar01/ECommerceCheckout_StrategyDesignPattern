package org.e_commerce_checkout_strategy_design_patterns;

public class Product {

    private String productName;
    private double productPrice;

    // all arguments constructor
    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // setter and getter methods
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    // helper method
    public double calculateProductPrice(MembershipType membershipType) {
        if(membershipType==MembershipType.REGULAR)
            return productPrice;
        else if(membershipType==MembershipType.GOLD)
            return productPrice*0.9;  // 10% discount
        else if(membershipType==MembershipType.PREMIUM)
            return productPrice*0.7;  // 30% discount
        return productPrice;
    }
}
