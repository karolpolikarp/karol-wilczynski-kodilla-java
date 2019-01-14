package com.kodilla.good.patterns.challenges.Food2Door.manufacturers;

import com.kodilla.good.patterns.challenges.Food2Door.Product;
import com.kodilla.good.patterns.challenges.Food2Door.User;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Manufacturer{

    private Map<Product, Integer> healthyShopProductsList;

    public HealthyShop() {
        healthyShopProductsList = getHealthyShopProductsList();
    }

    private Map<Product, Integer> getHealthyShopProductsList() {
        Map<Product, Integer> healthyShopProductsList = new HashMap<>();
        healthyShopProductsList.put(new Product("healthyShopProduct1"), 5);
        healthyShopProductsList.put(new Product("healthyShopProduct2"), 10);
        healthyShopProductsList.put(new Product("healthyShopProduct3"), 15);
        return healthyShopProductsList;
    }

    @Override
    public boolean process(User user, Map<Product, Integer> order) {
        System.out.println("Hello, thank you for ordering at HealthyShop, hope you have a *wink* healthy *wink* day!");
        return true;
    }
}
