package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    public boolean ordered(User user, LocalDateTime orderDate, Product product) {
        return true;
    }
}
