package com.ALI;

public class Candidate extends Person {

    private int vote_count;
    public Candidate(ElectionSystem subject, int id, String name){
        super(id,name);
        this.type="Candidate";
        this.subject = subject;
        this.subject.attach(this);
        vote_count=0;
    }

    public int getVote_count() {
        return vote_count;
    }

    @Override
    public void increment_vote()
    {
        vote_count++;
    }
    @Override
    public void update() {

    }
}
