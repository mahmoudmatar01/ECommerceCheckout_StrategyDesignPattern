# ECommerceCheckout_StrategyDesignPattern

This project showcases the **Strategy Design Pattern** by implementing a flexible checkout system for an e-commerce application. In this system, products have variable pricing based on membership levels, and customers can choose different payment methods at checkout.

---

## Table of Contents

1. [Features](#features)
2. [Technologies](#technologies)
3. [Design Pattern Explanation](#design-pattern-explanation)
4. [Usage](#usage)

---

## Features

- **Strategy Design Pattern** implementation to handle multiple pricing strategies and payment methods.
- Different **membership-based pricing strategies** (e.g., Regular, Gold, Premium) applied to products.
- Multiple **payment methods** available for processing payments: PayPal, Visa, and Bank Transfer.
- **Flexible checkout** process that allows dynamic selection of payment methods based on customer choice.

---

## Technologies

- **Language**: Java
- **Pattern**: Strategy Design Pattern

---

## Design Pattern Explanation

The Strategy Design Pattern is used in this project to provide interchangeable algorithms for product pricing and payment processing. Key components include:

- **MembershipPriceCalculator Interface**: Defines the strategy for calculating product prices based on membership.
- **PaymentMethodProcessor Interface**: Defines the strategy for processing payments using different methods.
- **Product Class**: Uses a `MembershipPriceCalculator` instance to calculate prices based on membership level.
- **Checkout Class**: Uses a `PaymentMethodProcessor` instance to handle payments.

### Classes Overview

- **`PaymentMethodProcessor`**: Interface for payment processors with a `checkoutProcessing` method.
    - **`PayPalPaymentProcessor`**, **`VisaPaymentProcessor`**, and **`BankTransferPaymentProcessor`**: Concrete implementations for payment processing strategies.
- **`MembershipPriceCalculator`**: Interface for calculating product prices based on membership type.
    - **`RegularPriceCalculator`**, **`GoldPriceCalculator`**, and **`PremiumPriceCalculator`**: Concrete implementations for price calculation strategies.
- **`Product`**: Class representing a product, with price calculation based on membership.
- **`Checkout`**: Class that processes payments using a chosen payment strategy.

---

## Usage

### Setup

1. Clone the repository and import it into your Java IDE.
2. Compile and run the `Main` class to see the Strategy Design Pattern in action.

### Example Code

Here's a sample code snippet showing how the system operates:

```java
public class Main {
    public static void main(String[] args) {

        // Create new products with different membership pricing strategies
        Product wallet = new Product("Wallet", 300, new RegularPriceCalculator());
        Product mobile = new Product("Mobile12", 20000, new GoldPriceCalculator());
        Product mac = new Product("Macbook Pro", 45000, new PremiumPriceCalculator());

        // Calculate product prices based on membership
        double walletPrice = wallet.calculateProductPrice();
        double mobilePrice = mobile.calculateProductPrice();
        double macPrice = mac.calculateProductPrice();

        // Process checkout with different payment methods
        Checkout checkoutVisa = new Checkout(new VisaPaymentProcessor());
        Checkout checkoutPayPal = new Checkout(new PayPalPaymentProcessor());
        Checkout checkoutBankTransfer = new Checkout(new BankTransferPaymentProcessor());

        checkoutVisa.checkoutProcessing(walletPrice);
        checkoutPayPal.checkoutProcessing(mobilePrice);
        checkoutBankTransfer.checkoutProcessing(macPrice);
    }
}
```

### Expected output

``` sql
Processing payment of visa for amount : 300.0
Processing payment of paypal for amount : 18000.0
Processing payment of bank transfer for amount : 31500.0
```
