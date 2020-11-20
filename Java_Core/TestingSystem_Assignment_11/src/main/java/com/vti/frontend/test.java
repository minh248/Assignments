package com.vti.frontend;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class test {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        AccountRepository accountRepository = new AccountRepository();

        List<Account> accounts = accountRepository.getListAccounts();
        for (Account a : accounts) {
            System.out.println(a.toString());
        }
    }
}
