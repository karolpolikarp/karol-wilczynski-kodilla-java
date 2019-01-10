package com.kodilla.good.patterns.challenges.ecommerce;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Dear " + user.getFirstName() + " " + user.getLastName() + ",");
        System.out.println("Thank you for placing your order. It is now processing.");
    }
}