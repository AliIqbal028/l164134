package com.ALI;

public class Voter extends Person {

    public Voter(ElectionSystem subject, int id, String name){
        super(id,name);
        this.type="Voter";
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void increment_vote() {
        //do nothing
    }

    @Override
    public void update() {
        System.out.println("It's 6pm, Voting closed!!!");
    }
}
