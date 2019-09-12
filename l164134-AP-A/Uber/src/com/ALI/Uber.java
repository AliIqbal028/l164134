package com.ALI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Uber {
    List<Driver> LD = new ArrayList<>();
    List<Customer> LC = new ArrayList<>();
    List<User> LU=new ArrayList<>();


    Scanner in= new Scanner(System.in);

    public void add_Driver(Driver d)
    {
        LD.add(d);
    }

    public void add_Customer(Customer u)
    {
        LC.add(u);
    }

    public void add__User(User u)
    {
        LU.add(u);
    }

    public void log_in()
    {
        System.out.println("enter id");
        int id=in.nextInt();
        for(int i=0;i<LU.size();i++)
        {
            if(id==LU.get(i).getId())
            {
                menu();
            }
        }
    }

    public void menu()
    {
        System.out.println("press 1 to start new ride");
        System.out.println("press 0 to cancel");
        int choice=in.nextInt();
        if(choice==1)
            finding_cab();


    }

    public void finding_cab()
    {
        System.out.println("Finding a cab");

        try                                  // delay
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        Driver temp=assign_driver();
        if (temp == null) {
            System.out.println("no cab available right now");
        }
        else {
            temp.setIn_ride_true();
            System.out.println("cab found");
            System.out.print("Driver name: ");
            System.out.println(temp.getName());
            System.out.print("Driver rating: ");
            System.out.println(temp.getRating());


            System.out.println("enter 1 to stop the ride");
            long start = System.currentTimeMillis();
            int stop = in.nextInt();
            // finding the time after the operation is executed
            long end = System.currentTimeMillis();
            //finding the time difference and converting it into seconds

            System.out.println("your ride lasted for ");
            float sec = (end - start) / 1000F;
            System.out.println(sec + " seconds");
            fare(sec); //calculate fare

            System.out.println("rate your ride betwwen 1 and 5");
            int rating = in.nextInt();
            temp.add_rating(rating);
            temp.setIn_ride_false();
        }

        menu();



    }

    public void fare( float sec)
    {
        System.out.println("Fare= "+ (int)sec*5+ " rs");
    }

    Driver assign_driver()   //selects driver who's not currently driving
    {
        for(int i=0;i<LU.size();i++)
        {
            if(LU.get(i).isIn_ride()==false)
                return LD.get(i);

        }

        return null;
    }

}
