package com.ALI;

public abstract class User {
    int id;
    String name;
    boolean status;

    public User(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract boolean isIn_ride();

}
