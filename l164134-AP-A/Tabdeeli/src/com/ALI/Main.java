package com.ALI;

public class Main {

    public static void main(String[] args) {
        ElectionSystem es=new ElectionSystem();

        Candidate c1=new Candidate(es,1,"hannah");
        Candidate c2=new Candidate(es,2,"katharina");

        Voter v=new Voter(es,4134,"ulrich");
        es.cast_vote();
        es.notifyAllObservers();

    }
}
