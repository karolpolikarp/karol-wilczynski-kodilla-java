package com.kodilla.good.patterns.challenges.ecommerce;

public class Product {

    private String productName;
    private double productPrice;
    private int productQuantity;

    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return  "Product = '" + productName + '\'' +
                ", Price = " + productPrice + " PLN" +
                ", Quantity = " + productQuantity;
    }
}
