package com.company;

import java.time.LocalDate;

public class Ex2 {
    public static void main(String[] args) {
        // Question 1
        Account[] accounts = new Account[5];

        for (int i = 0; i < 5 ; i++) {
            Account account = new Account();

            account.id = i + 1;
            account.email = "Email" + (i + 1);
            account.fullname = "Full name" + (i + 1);
            account.createDate = LocalDate.now();

            accounts[i] = account;
        }
    }
}
