package com.kodilla.good.patterns.challenges.ecommerce;

public class PlatformRunner {
    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}