package com.kodilla.good.patterns.challenges.ecommerce;

public class ProductOrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDTO process(final ProductOrderRequest productOrderRequest) {

        boolean isOrdered = orderService.ordered(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct());

        if (isOrdered) {
            informationService.inform(productOrderRequest.getUser());
            orderRepository.createProductOrder(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct());
            return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), true);
        } else {
            System.out.println("Error processing order.");
            return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), false);
        }
    }
}