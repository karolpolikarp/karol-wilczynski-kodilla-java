package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.manufacturers.Manufacturer;

import java.util.Map;

public class OrderRequest {
    private User user;
    private Manufacturer manufacturer;
    private Map<Product, Integer> orderRequest;

    public OrderRequest(User user, Manufacturer manufacturer, Map<Product, Integer> orderRequest) {
        this.user = user;
        this.manufacturer = manufacturer;
        this.orderRequest = orderRequest;
    }

    public User getUser() {
        return user;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Map<Product, Integer> getOrderRequest() {
        return orderRequest;
    }
}
