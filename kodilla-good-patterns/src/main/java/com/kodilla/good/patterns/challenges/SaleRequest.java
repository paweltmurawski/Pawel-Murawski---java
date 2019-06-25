package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleRequest {

    private User user;
    private LocalDateTime dateOfSale;

    public SaleRequest(User user, LocalDateTime dateOfSale) {
        this.user = user;
        this.dateOfSale = dateOfSale;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfSale() {
        return dateOfSale;
    }
}
