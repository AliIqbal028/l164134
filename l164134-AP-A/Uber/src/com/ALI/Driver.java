package com.ALI;

public class Driver extends User {
    float rating;
    boolean in_ride=false;
    public Driver(int id, String name) {
        super(id, name, false); //status= false for driver
        rating=5;  //default rating
    }
    public void add_rating(float rat)
    {
        rating=(rat+rating)/2;
    }

    public void setIn_ride_true() {
        this.in_ride = true;
    }

    public void setIn_ride_false() {
        this.in_ride = false;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public boolean isIn_ride() {
        return in_ride;  //Driver is in the ride
    }
}
