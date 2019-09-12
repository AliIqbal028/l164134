package com.ALI;

public class Main {

    public static void main(String[] args) {

        Uber b=new Uber();
        User u1= new Driver(1234,"shakeel");
        b.add__User(u1);

        User u2= new Driver(1235,"usman");
        b.add__User(u2);

        User u3= new Driver(1236,"killua");
        b.add__User(u3);

        User u4= new Driver(1237,"gon");
        b.add__User(u4);

        User c1=new Customer(4134,"wick");
        b.add__User(c1);

        User c2=new Customer(5144,"jon");
        b.add__User(c2);

        b.log_in();

    }
}
