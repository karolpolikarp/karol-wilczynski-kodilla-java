package com.kodilla.good.patterns.challenges.Food2Door;

public class User {

    private String userName;
    private String deliveryAdress;

    public User(String userName, String deliveryAdress) {
        this.userName = userName;
        this.deliveryAdress = deliveryAdress;
    }

    public String getUserName() {
        return userName;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

}