package com.vti.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.entity.Account;

public class AccountService {

	private AccountRepository repository;

	public AccountService() throws IOException, SQLException, ClassNotFoundException {
		repository = new AccountRepository();
	}
}
