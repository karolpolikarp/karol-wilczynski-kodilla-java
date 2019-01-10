package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;

public interface OrderService {
    boolean ordered(User user, LocalDateTime orderDate, Product product);
}

