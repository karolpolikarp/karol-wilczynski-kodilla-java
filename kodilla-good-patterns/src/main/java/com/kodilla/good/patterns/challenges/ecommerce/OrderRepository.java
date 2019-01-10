package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createProductOrder(User user, LocalDateTime orderDate, Product product);
}
