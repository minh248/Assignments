package com.vti.entity;

import javax.xml.namespace.QName;
import java.time.LocalDate;

public class Group {
    private int id;
    private String name;
    private Account[] accounts;
    private LocalDate createDate;

    public Group(){

    }

    public Group(String name, Account[] accounts, String createDate){
        this.name = name;
        this.accounts = accounts;
        this.createDate = LocalDate.parse(createDate);
    }

    public Group(String name, String[] usernames, String createDate){
        this.name = name;

        Account[] accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            accounts[i] = new Account(usernames[i]);
        }
        this.accounts = accounts;

        this.createDate = LocalDate.parse(createDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
