package com.ALI;


public abstract class Person {
    int id;
    String name;
    protected String type;
    protected ElectionSystem subject;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void increment_vote();
    public abstract void update();

}
