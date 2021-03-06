package com.kodilla.good.patterns.challenges.ecommerce;

import com.kodilla.good.patterns.challenges.ecommerce.productCategories.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        User user = new User("Karolpolikarp", "Karol", "Wilczynski");

        LocalDateTime orderDate = LocalDateTime.of(2019, 1, 8, 13, 30);

        Product product = new Game("Red Dead Redemption II", 219, 1);
//        Product product = new Footwear("FlipFlops", 50, 1);
//        Product product = new HealthAndWellness("Soft blue toothbrush", 5, 1);

        System.out.println("Retrieving new product request:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-LLL-dd HH:mm");

        String s = orderDate.format(formatter);
        System.out.println("User: " + user.getUserName() + " Date: " + s + "\n" + product);

        return new ProductOrderRequest(user, orderDate, product);
    }
}
