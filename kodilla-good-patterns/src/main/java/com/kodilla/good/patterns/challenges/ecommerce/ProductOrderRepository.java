package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public void createProductOrder(User user, LocalDateTime orderDate, Product product) {
        System.out.println("Creating new order is now completed.");
    }
}
