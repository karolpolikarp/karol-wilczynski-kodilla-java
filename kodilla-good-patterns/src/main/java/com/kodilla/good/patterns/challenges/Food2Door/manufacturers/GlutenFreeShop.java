package com.kodilla.good.patterns.challenges.Food2Door.manufacturers;

import com.kodilla.good.patterns.challenges.Food2Door.Product;
import com.kodilla.good.patterns.challenges.Food2Door.User;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Manufacturer{

    private Map<Product, Integer> glutenFreeShopProductsList;

    public GlutenFreeShop() {
        glutenFreeShopProductsList = getGlutenFreeShopProductsList();
    }

    private Map<Product, Integer> getGlutenFreeShopProductsList() {
        Map<Product, Integer> glutenFreeShopProductsList = new HashMap<>();
        glutenFreeShopProductsList.put(new Product("glutenFreeShopProduct1"), 5);
        glutenFreeShopProductsList.put(new Product("glutenFreeShopProduct2"), 10);
        glutenFreeShopProductsList.put(new Product("glutenFreeShopProduct3"), 15);
        return glutenFreeShopProductsList;
    }

    @Override
    public boolean process(User user, Map<Product, Integer> order) {
        return true;
    }
}
