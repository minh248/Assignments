package com.vti.backend.datalayer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

		// get connection
		Connection connection = jdbcUtils.connect();

		// create a statement object
		String sql = "SELECT AccountId, Email, Username, FullName FROM `Account`";
		Statement statement = connection.createStatement();

		// execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// Handing result set
		while (resultSet.next()) {
			Account account = new Account(resultSet.getInt("AccountId"), resultSet.getString("Email"),
					resultSet.getString("Username"), resultSet.getString("Fullname"));

			accounts.add(account);
		}

		// disconnect
		jdbcUtils.disconnect();
		return accounts;
	}
}