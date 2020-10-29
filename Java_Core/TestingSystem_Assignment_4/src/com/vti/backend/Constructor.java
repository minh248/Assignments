package com.vti.backend;

import com.vti.entity.*;

public class Constructor {

    // Question 1
    public void question1(){
        Department department1 = new Department("HR");
        System.out.println("department1");
        System.out.println(department1.getName());
    }

    // Question 2
    public void question2(){
        // Create position
        Position position1 = new Position(1, "Manager");
        Position position2 = new Position(2, "Team Leader");

        // a)
        Account account1 = new Account();
        // b)
        Account account2 = new Account(1, "benj@gmail.com","benjamin", "Benjamin", "");
        // c)
        Account account3 = new Account(2, "jack@gmail.com","jack", "Jack", "", position1);
        // d)
        Account account4 = new Account(3, "benj@gmail.com","benjamin", "Benjamin", "", position2, "2020-08-24");
    }


    // Question 3
    public void question3() {
        // Create accounts
        Account account1 = new Account(1, "benj@gmail.com", "benjamin", "Benjamin", "");
        Account account2 = new Account(2, "jack@gmail.com", "jack", "Jack", "");
        Account account3 = new Account(3, "seraphine@gmail.com", "seraphine", "Seraphine", "");

        // Create an array of account
        Account[] accounts = {account1, account2, account3};

        // Create username array
        String[] usernames = {"benjamin", "jack", "seraphine"};

        Group group1 = new Group();
        Group group2 = new Group("Java Fresher", accounts, "2000-08-24");
        Group group3 = new Group("DB Fresher", usernames, "2000-08-24");
    }
}
