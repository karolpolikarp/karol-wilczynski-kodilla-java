package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.manufacturers.Manufacturer;

public class OrderRequest {
    private User user;
    private Manufacturer manufacturer;


    public OrderRequest(User user, Manufacturer manufacturer) {
        this.user = user;
        this.manufacturer = manufacturer;
    }

    public User getUser() {
        return user;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}

