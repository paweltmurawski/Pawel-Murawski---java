package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class ProductOrderInformation {
    private LocalDateTime dateOfRealization;
    private OrderProcess producer;
    private Product product;

    public ProductOrderInformation(OrderProcess producer, Product product, LocalDateTime dateOfRealization) {
        this.producer = producer;
        this.product = product;
        this.dateOfRealization = dateOfRealization;
    }

    public OrderProcess getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfRealization() {
        return dateOfRealization;
    }
}
