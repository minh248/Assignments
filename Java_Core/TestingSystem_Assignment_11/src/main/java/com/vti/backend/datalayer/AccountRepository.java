package com.vti.backend.datalayer;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Account;
import com.vti.utils.JDBCUtils;

public class AccountRepository {

	private JDBCUtils jdbcUtils;

	public AccountRepository() throws IOException, SQLException, ClassNotFoundException {
		jdbcUtils = new JDBCUtils();
	}

	public List<Account> getListAccounts() throws SQLException, ClassNotFoundException {

		List<Account> accounts = new ArrayList<>();

		Connection connection = jdbcUtils.connect();

		String sql = "SELECT AccountId, Email, Username, FullName FROM `accounts`";
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			Account account = new Account(resultSet.getInt("AccountId"), resultSet.getString("Email"),
					resultSet.getString("Username"), resultSet.getString("Fullname"));

			accounts.add(account);
		}

		jdbcUtils.disconnect();
		return accounts;
	}
}