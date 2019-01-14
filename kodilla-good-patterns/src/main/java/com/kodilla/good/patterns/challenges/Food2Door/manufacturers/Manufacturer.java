package com.kodilla.good.patterns.challenges.Food2Door.manufacturers;

import com.kodilla.good.patterns.challenges.Food2Door.Product;
import com.kodilla.good.patterns.challenges.Food2Door.User;

import java.util.Map;

public interface Manufacturer {
    boolean process(User user, Map<Product, Integer> order);
}
