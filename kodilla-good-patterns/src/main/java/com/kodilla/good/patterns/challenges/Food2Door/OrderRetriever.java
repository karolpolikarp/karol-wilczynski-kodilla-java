package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.manufacturers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        User user = new User("Karolpolikarp", "Warszawa");

        Manufacturer manufacturer = new ExtraFoodShop();
        Map<Product, Integer> extraFoodShopProductsList = new HashMap<>();
        extraFoodShopProductsList.put(new Product("extraFoodShopProduct1"), 1);
        extraFoodShopProductsList.put(new Product("extraFoodShopProduct2"), 1);
        extraFoodShopProductsList.put(new Product("extraFoodShopProduct3"), 1);

        Manufacturer manufacturer1 = new GlutenFreeShop();
        Map<Product, Integer> glutenFreeShopProductsList = new HashMap<>();
        glutenFreeShopProductsList.put(new Product("glutenFreeShopProduct1"), 1);
        glutenFreeShopProductsList.put(new Product("glutenFreeShopProduct2"), 1);
        glutenFreeShopProductsList.put(new Product("glutenFreeShopProduct3"), 1);

        Manufacturer manufacturer2 = new HealthyShop();
        Map<Product, Integer> healthyShopProductsList = new HashMap<>();
        healthyShopProductsList.put(new Product("healthyShopProduct1"), 1);
        healthyShopProductsList.put(new Product("healthyShopProduct2"), 1);
        healthyShopProductsList.put(new Product("healthyShopProduct3"), 1);

        orderRequestList.add(new OrderRequest(user, manufacturer, extraFoodShopProductsList));
        orderRequestList.add(new OrderRequest(user, manufacturer1, glutenFreeShopProductsList));
        orderRequestList.add(new OrderRequest(user, manufacturer2, healthyShopProductsList));

        return orderRequestList;
    }
}
