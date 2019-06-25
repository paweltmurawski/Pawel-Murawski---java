package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class InformationService {

    public boolean isAvailable = true;

    public void inform(User user, LocalDateTime localDateTime) {
        if(isAvailable) {
            System.out.println("Inform client that product will be delivered in two days time");
        } else {
            System.out.println("We are sorry but product you want to buy is unavailable");
        }
    }
}
