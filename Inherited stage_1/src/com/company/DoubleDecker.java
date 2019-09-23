package com.company;

public class DoubleDecker extends Car {
    private int roadServicesMonths;

    public DoubleDecker(int roadServicesMonths) {
        super("Mercedes", "5w5", 5, 5, 6, false);
        this.roadServicesMonths = roadServicesMonths;
    }
}
