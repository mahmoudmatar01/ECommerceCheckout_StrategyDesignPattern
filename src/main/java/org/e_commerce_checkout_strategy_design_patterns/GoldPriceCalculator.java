package org.e_commerce_checkout_strategy_design_patterns;

public class GoldPriceCalculator implements MembershipPriceCalculator{
    @Override
    public double calculateProductPrice(double price) {
        return price * 0.9;
    }
}
