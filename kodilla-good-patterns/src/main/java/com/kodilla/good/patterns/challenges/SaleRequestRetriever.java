package com.kodilla.good.patterns.challenges;


import java.time.LocalDateTime;

public class SaleRequestRetriever {

    public SaleRequest retrieve() {

        User user = new User("John", "Black", "345647557", "Prosta");
        LocalDateTime dateOfSale = LocalDateTime.of (2019, 8, 21, 6, 13);

        return new SaleRequest(user, dateOfSale);
    }

}
