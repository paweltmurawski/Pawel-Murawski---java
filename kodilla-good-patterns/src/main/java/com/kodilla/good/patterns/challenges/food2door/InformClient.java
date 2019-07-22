package com.kodilla.good.patterns.challenges.food2door;

public class InformClient {
    private boolean isOrderRealized = true;

    public boolean clientInform(ProductOrderInformation productOrderInformation) {
        if (isOrderRealized) {
            System.out.println("We have completed order request");
        }
        return false;
    }
}

