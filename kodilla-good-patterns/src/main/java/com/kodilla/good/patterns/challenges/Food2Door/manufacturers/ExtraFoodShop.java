package com.kodilla.good.patterns.challenges.Food2Door.manufacturers;

import com.kodilla.good.patterns.challenges.Food2Door.Product;
import com.kodilla.good.patterns.challenges.Food2Door.User;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Manufacturer {

    private Map<Product, Integer> extraFoodShopProductsList;

    public ExtraFoodShop() {
        extraFoodShopProductsList = getExtraFoodShopProductsList();
    }

    private Map<Product, Integer> getExtraFoodShopProductsList() {
        Map<Product, Integer> extraFoodShopProductsList = new HashMap<>();
        extraFoodShopProductsList.put(new Product("extraFoodShopProduct1"), 5);
        extraFoodShopProductsList.put(new Product("extraFoodShopProduct2"), 10);
        extraFoodShopProductsList.put(new Product("extraFoodShopProduct3"), 15);
        return extraFoodShopProductsList;
    }

    @Override
    public boolean process(User user, Map<Product, Integer> order) {
        return true;
    }
}
