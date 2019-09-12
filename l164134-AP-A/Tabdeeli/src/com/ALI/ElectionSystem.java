package com.ALI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectionSystem {
    private List<Person> people = new ArrayList<>();
    public void attach(Person person){
        people.add(person);
    }

    Scanner in= new Scanner(System.in);

    public void notifyAllObservers(){
        for (Person person : people) {
            person.update();
        }
    }

    public void cast_vote()
    {
        System.out.println("enter your id");
        int id=in.nextInt();
        if(check_status(id)) {
            System.out.println("enter the id of the candidate you want to vote");
            for(int i = 0; i< people.size(); i++)
            {
                if(people.get(i).getType()!="Voter")
                    System.out.println(people.get(i).getId() + ": " + people.get(i).getName());
            }
            int Candidate_id=in.nextInt();
            for(int i = 0; i< people.size(); i++)
            {
                if(Candidate_id== people.get(i).getId())
                {
                    people.get(i).increment_vote();
                    System.out.println("DONE!!!");

                }
            }
        }
        else
            System.out.println("you are not registered");
    }

    boolean check_status(int id)
    {
        for(int i = 0; i< people.size(); i++)
        {
            if(id== people.get(i).getId())
                return true;
        }
        return false;
    }
}
