package com.kodilla.good.patterns.challenges.Food2Door;

public class Food2DoorRunner {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processOrders(new OrderRetriever().retrieve());
    }
}
