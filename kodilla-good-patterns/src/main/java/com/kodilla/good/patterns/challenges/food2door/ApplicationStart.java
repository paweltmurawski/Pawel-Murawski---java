package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class ApplicationStart {
    public static void main(String[] args) {
        ProductOrderInformation productOrderInformation = new ProductOrderInformation(new ProducentExtraFoodShop(), new Product("pasta", 3, "frr"), LocalDateTime.of(2019, 12, 30, 12, 12));

        ProductOrderRealization productOrderRealization = new ProductOrderRealization(new ProductRepository(), new InformClient());
        productOrderRealization.realizationProcess(productOrderInformation);
    }
}
