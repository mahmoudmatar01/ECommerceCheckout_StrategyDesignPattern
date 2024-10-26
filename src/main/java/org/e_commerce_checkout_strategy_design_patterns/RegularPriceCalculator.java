package org.e_commerce_checkout_strategy_design_patterns;

public class RegularPriceCalculator implements MembershipPriceCalculator{
    @Override
    public double calculateProductPrice(double price) {
        return price;
    }
}
