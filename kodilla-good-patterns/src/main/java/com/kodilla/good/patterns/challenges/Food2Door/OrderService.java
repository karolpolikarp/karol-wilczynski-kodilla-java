package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class OrderService {

    public void processOrders(List<OrderRequest> orderRequestService) {

        orderRequestService.stream()
                .map(a -> {
                    System.out.println("Processing order for " + a.getUser().getUserName() + ".");
                    System.out.println("Delivery destination is " + a.getUser().getDeliveryAdress() + ".");
                    return a.getManufacturer().process(a.getUser(), a.getOrderRequest());
                })
                .forEach(b -> System.out.println("Processing order complete: " + b + "." + "\n"));
    }
}