package com.ALI;

public class Customer extends User {
    public Customer(int id, String name) {
        super(id, name, true);  //status = true for customer
    }

    @Override
    public boolean isIn_ride() {
        return false;   // customer is in the ride
    }
}
