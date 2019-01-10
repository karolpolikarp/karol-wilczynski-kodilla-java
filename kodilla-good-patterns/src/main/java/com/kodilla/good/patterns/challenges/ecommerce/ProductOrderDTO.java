package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;

public class ProductOrderDTO {

    private User user;
    private LocalDateTime orderDate;
    private Product product;
    private boolean isOrdered;

    public ProductOrderDTO(final User user, final LocalDateTime orderDate, final Product product, final boolean isOrdered) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
