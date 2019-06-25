package com.kodilla.good.patterns.challenges;

public class User {

    private String userName;
    private String userSurname;
    private String phoneNumber;
    private String address;

    public User(final String userName, final String userSurname, final String phoneNumber, final String address) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}

